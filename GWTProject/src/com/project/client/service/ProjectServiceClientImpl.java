package com.project.client.service;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.project.client.gui.MainGUI;
import com.project.client.model.PersonInfo;

public class ProjectServiceClientImpl implements ProjectServiceClientInt {

	private ProjectServiceAsync service;
	private MainGUI maingui;
	public ProjectServiceClientImpl(String url)
	{
		System.out.println(url);
		this.service=GWT.create(ProjectService.class);
		ServiceDefTarget endpoint=(ServiceDefTarget) this.service;
		endpoint.setServiceEntryPoint(url);
		this.maingui=new MainGUI(this);
	}
	@Override
	public void sayHello(String name) {
		this.service.sayHello(name, new DefaultCallback() );
		
	}
	public void addTwoNumbers(int a,int b)
	{
		this.service.addTwoNumbers(a, b, new DefaultCallback());
	}
	@Override
	public void avgTwoNumbers(double a, double b) {
		this.service.avgTwoNumbers(a, b, new DefaultCallback());
		
	}
	@Override
	public void getPersonInfo(String familyName) {
		this.service.getPersonInfo(familyName, new DefaultCallback());
		
	}
	public MainGUI getMainGUI()
	{
		return this.maingui;
	}
	private class DefaultCallback implements AsyncCallback
	{

		@Override
		public void onFailure(Throwable caught) {
			System.out.println("An error occured");
		}

		@Override
		public void onSuccess(Object result) {
			if(result instanceof String)
			{
				String greeting=(String) result;
				maingui.updateLabel(greeting);
			}	
			else if(result instanceof Integer)
			{
				int sum=(Integer)result;
				maingui.updateSum(sum);
			}
			else if(result instanceof Double)
			{
				double avg=(Double)result;
				maingui.updateAvg(avg);
			}
			else if(result instanceof PersonInfo )
			{
				PersonInfo info=(PersonInfo)result;
				maingui.displayPersonalInfo(info);
			}
		}
		
	}
	
	
}
