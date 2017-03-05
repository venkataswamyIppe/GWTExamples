package com.project.server;

import com.project.client.model.PersonInfo;
import com.project.client.service.ProjectService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class ProjectServiceImpl extends RemoteServiceServlet implements
		ProjectService {

	@Override
	public String sayHello(String name) throws IllegalArgumentException {
		String message="Hello Good Morning..! "+name;
		return message;
	}

	@Override
	public int addTwoNumbers(int a, int b) {
		int add=a+b;
		return add;
	}

	@Override
	public double avgTwoNumbers(double a, double b) {
		double avg=(a+b)/2;
		return avg;
	}

	@Override
	public PersonInfo getPersonInfo(String familyName) {
		PersonInfo bioData=new PersonInfo();
		bioData.setName("venky");
		bioData.setAge(22);
		bioData.setGender("Male");
		return bioData;
	}

	
	
}
