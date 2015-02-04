package rota.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rota.dao.PersonRepository;
import rota.entities.Address;
import rota.entities.Person;
import rota.services.PeopleService;

@Transactional
@Service
public class PeopleServiceImpl implements PeopleService {
	@Autowired
	private PersonRepository personRepository;
	
	/**
	 * {@inheritDoc}
	 */
	public void createTestData() {
		Person person = new Person();
		person.setFirstName("Marc");
		person.setLastName("Thomas");
		person.setEmail("marc.thomas@thethomashouse.co.uk");
		person.setTitle("Mr");
		Address homeAddress = new Address();
		homeAddress.setAddressLine1("36 Bedford Road");
		homeAddress.setTown("Sutton Coldfield");
		homeAddress.setCounty("West Midlands");
		homeAddress.setPostCode("B75 6AB");
		person.setHomeAddress(homeAddress);
		
		Address workAddress = new Address();
		workAddress.setAddressLine1("94 Hurdis Road");
		workAddress.setTown("Seaford");
		workAddress.setCounty("East Sussex");
		workAddress.setPostCode("BN25 2TQ");
		
		personRepository.save(person);
		
		// save a couple of customers
		personRepository.save(new Person("Mr", "Jack", "Bauer", "jack.bauer@ctu.gov"));
		personRepository.save(new Person("Miss", "Chloe", "O'Brian", "chloe.obrian@ctu.gov"));
        
        List<Person> findByFirstName = personRepository.findByFirstName("Jack");
        System.out.println(findByFirstName.size());
        
        findByFirstName = personRepository.findByFirstNameLike("Jac%");
        System.out.println(findByFirstName.size());
	}
	
}
