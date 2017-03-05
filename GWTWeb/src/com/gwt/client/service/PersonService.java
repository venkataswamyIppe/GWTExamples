package com.gwt.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.gwt.client.events.DataEvent;


@RemoteServiceRelativePath("personservice")
public interface PersonService extends RemoteService
{
	DataEvent getPersonInfo();
	DataEvent updatePersonInfo(String name,int age,String gender);
}
