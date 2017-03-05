package com.gwt.client.events;

import com.gwt.client.model.Person;

public class PersonRetriveEvent extends DataEvent{
	
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
