package rota.entities;

import java.util.Date;

/**
 * This class represents an item that will be used to see if people are
 * available.
 * 
 * @author marcth
 *
 */
public class RotaItem {
	private boolean allDay = true;
	private Date start;
	private Date finish;
	private Person assignee;

	public RotaItem(Date start, Date finish) {
		this.start = start;
		this.finish = finish;
	}
	
	public RotaItem(Date start, Date finish, Person assignee) {
		super();
		this.start = start;
		this.finish = finish;
		this.assignee = assignee;
	}

	public boolean isAllDay() {
		return allDay;
	}

	public void setAllDay(boolean allDay) {
		this.allDay = allDay;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getFinish() {
		return finish;
	}

	public void setFinish(Date finish) {
		this.finish = finish;
	}

	public Person getAssignee() {
		return assignee;
	}

	public void setAssignee(Person assignee) {
		this.assignee = assignee;
	}
}
