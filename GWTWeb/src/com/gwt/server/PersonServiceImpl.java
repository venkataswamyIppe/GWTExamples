package com.gwt.server;


import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.gwt.client.events.DataEvent;
import com.gwt.client.events.PersonRetriveEvent;
import com.gwt.client.events.PersonUpdatedEvent;
import com.gwt.client.model.Person;
import com.gwt.client.service.PersonService;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class PersonServiceImpl extends RemoteServiceServlet implements
		PersonService {

	@Override
	public DataEvent getPersonInfo() {
		Person personInfo=new Person();
		personInfo.setName("venky");
		personInfo.setAge(22);
		personInfo.setGender("Male");
		PersonRetriveEvent event=new PersonRetriveEvent();
		event.setPerson(personInfo);
		return event;
	}

	

	@Override
	public DataEvent updatePersonInfo(String name, int age, String gender) {
		Person personInfo=new Person();
		personInfo.setName(name);
		personInfo.setAge(age);
		personInfo.setGender(gender);
		PersonUpdatedEvent updateEvent=new PersonUpdatedEvent();
		updateEvent.setPerson(personInfo);
		return updateEvent;
	}

	

			
	
}
