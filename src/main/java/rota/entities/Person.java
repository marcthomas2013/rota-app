package rota.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * This class is responsible for holding the person's details that will be in
 * the rota. It will have contact information that can be used to send emails,
 * texts etc. for rota updates.
 * 
 * @author marcth
 */
@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String title;
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	private String telephone;

	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Address homeAddress;

	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Address workAddress;

	public Person() {
	}

	public Person(String title, String firstName, String lastName, String email) {
		super();
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public Person(String title, String firstName, String lastName,
			String email, String mobile, String telephone, Address homeAddress,
			Address workAddress) {
		super();
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.telephone = telephone;
		this.homeAddress = homeAddress;
		this.workAddress = workAddress;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", title=" + title + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobile=" + mobile + ", telephone=" + telephone
				+ ", homeAddress=" + homeAddress + ", workAddress="
				+ workAddress + "]";
	}
}
