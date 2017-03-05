package com.gwt.client.gui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.gwt.client.model.Person;

public class PersonInfoPage extends Composite {
	private MainView mainview;
	private VerticalPanel vPanel=new VerticalPanel();
	
	public PersonInfoPage(MainView mainView, Person person) {
		initWidget(this.vPanel);
		this.mainview=mainView;
		
		Label titleLb=new Label("Person Information");
		this.vPanel.add(titleLb);
		this.vPanel.setCellHorizontalAlignment(titleLb, HasHorizontalAlignment.ALIGN_CENTER);
		
		FlexTable ftable=new FlexTable();
		this.vPanel.add(ftable);
		this.vPanel.setCellHorizontalAlignment(ftable,HasHorizontalAlignment.ALIGN_CENTER);
		
		Label nameLb=new Label("Name");
		ftable.setWidget(0, 0, nameLb);
		
		Label ageLb=new Label("Age");
		ftable.setWidget(1, 0, ageLb);
		
		Label genderLb=new Label("Gender");
		ftable.setWidget(2, 0, genderLb);
		
		Label name=new Label(person.getName());
		ftable.setWidget(0, 1, name);
		
		Label age=new Label(" "+person.getAge());
		ftable.setWidget(1, 1, age);
		
		Label gender=new Label(person.getGender());
		ftable.setWidget(2, 1, gender);
		
		
		Button editBtn=new Button("Edit");
		this.vPanel.add(editBtn);
		this.vPanel.setCellHorizontalAlignment(editBtn, HasHorizontalAlignment.ALIGN_CENTER);
		editBtn.addClickHandler(new EditClickHandler());
		
	}
	private class EditClickHandler implements ClickHandler
	{
		
		@Override
		public void onClick(ClickEvent event) {
			mainview.openPersonInfoEditPage();
		}
	}
}