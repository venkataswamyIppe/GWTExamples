package com.gwt.client.gui;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.gwt.client.events.DataEvent;
import com.gwt.client.events.PersonRetriveEvent;
import com.gwt.client.events.PersonUpdatedEvent;
import com.gwt.client.model.Person;
import com.gwt.client.service.PersonServiceClientImpl;

public class MainView extends Composite
{
	private PersonServiceClientImpl listiner;
	private VerticalPanel vPanel=new VerticalPanel();
	private Person personInfo;
	public MainView(PersonServiceClientImpl listiner)
	{
		initWidget(this.vPanel);
		this.vPanel.setWidth("100%");
		this.listiner=listiner;
		this.listiner.getPersonInfo();
	}
	public void openPersonInfoPage()
	{
		
		this.vPanel.clear();
		PersonInfoPage page1=new PersonInfoPage(this,this.personInfo);
		this.vPanel.add(page1);
		this.vPanel.setCellHorizontalAlignment(page1,HasHorizontalAlignment.ALIGN_CENTER );
	}
	public void openPersonInfoEditPage()
	{
		this.vPanel.clear();
		PersonInfoPage page2=new PersonInfoPage(this,this.personInfo);
		this.vPanel.add(page2);
		this.vPanel.setCellHorizontalAlignment(page2,HasHorizontalAlignment.ALIGN_CENTER);
	}
	public void openPersonInfoSavedPage()
	{
		this.vPanel.clear();
		PersonInfoPage page3=new PersonInfoPage(this,this.personInfo);
		this.vPanel.add(page3);
		this.vPanel.setCellHorizontalAlignment(page3,HasHorizontalAlignment.ALIGN_CENTER );
	}
	public void handleEvent(DataEvent event)
	{
		if(event instanceof PersonRetriveEvent)
		{
			PersonRetriveEvent retriveEvent=new PersonRetriveEvent();
			this.personInfo=retriveEvent.getPerson();
			this.openPersonInfoPage();
		}
		else if(event instanceof PersonUpdatedEvent)
		{
			PersonUpdatedEvent updatedEvent=new PersonUpdatedEvent();
			this.personInfo=updatedEvent.getPerson();
			this.openPersonInfoSavedPage();
		}
	}
	public PersonServiceClientImpl getListiner()
	{
		return this.listiner;
	}
}
