package com.project.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.project.client.model.PersonInfo;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("projectservice")
public interface ProjectService extends RemoteService {
	String sayHello(String name) throws IllegalArgumentException;
	int addTwoNumbers(int a ,int b);
	double avgTwoNumbers(double a,double b);
	PersonInfo getPersonInfo(String familyName);
}
