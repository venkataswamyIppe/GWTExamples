package com.gwt.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface PersonServiceAsync {
	void getPersonInfo(AsyncCallback callback);
	void updatePersonInfo(String name,int age,String gender,AsyncCallback callback);
}
