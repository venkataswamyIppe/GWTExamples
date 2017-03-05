package com.gwt.client.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.gwt.client.events.DataEvent;
import com.gwt.client.gui.MainView;

public class PersonServiceClientImpl implements PersonServiceClientInt {
	private PersonServiceAsync service;
	private MainView mainview;
	
	public PersonServiceClientImpl(String url)
	{
		this.service=GWT.create(PersonService.class);
		ServiceDefTarget endpoint=(ServiceDefTarget)this.service;
		endpoint.setServiceEntryPoint(url);
		this.mainview=new MainView(this);
	}
	@Override
	public void getPersonInfo() {
		this.service.getPersonInfo(new DefaultCallback());
	}
	@Override
	public void updatePersonInfo(String name, int age, String gender) {
		this.service.updatePersonInfo(name, age, gender, new DefaultCallback());
		
	}
	public MainView getMainGUI()
	{
		return this.mainview;
	}
	public class DefaultCallback implements AsyncCallback<DataEvent>
	{

		@Override
		public void onFailure(Throwable caught) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void onSuccess(DataEvent result) {
			mainview.handleEvent(result);
		}
		
	}
	
}
