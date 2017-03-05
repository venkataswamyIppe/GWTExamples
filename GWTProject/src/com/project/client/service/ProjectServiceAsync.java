package com.project.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;


public interface ProjectServiceAsync {
	void sayHello(String input, AsyncCallback<String> callback)
			throws IllegalArgumentException;
	void addTwoNumbers(int a,int b,AsyncCallback callback);
	void avgTwoNumbers(double a,double b,AsyncCallback callback);
	void getPersonInfo(String familyName,AsyncCallback callback);
}
