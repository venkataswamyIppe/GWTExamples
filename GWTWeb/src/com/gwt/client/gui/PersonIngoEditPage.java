package com.gwt.client.gui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.gwt.client.model.Person;

public class PersonIngoEditPage extends Composite {
	private MainView mainview;
	private VerticalPanel vPanel=new VerticalPanel();
	private TextBox name;
	private TextBox age;
	private TextBox gender;
	
	public PersonIngoEditPage(MainView mainview,Person person)
	{
		initWidget(this.vPanel);
		this.mainview=mainview;
		Label titileLb=new Label("Person Information");
		this.vPanel.add(titileLb);
		this.vPanel.setCellHorizontalAlignment(titileLb,HasHorizontalAlignment.ALIGN_CENTER);
		
		FlexTable ftable=new FlexTable();
		this.vPanel.add(ftable);
		this.vPanel.setCellHorizontalAlignment(ftable,HasHorizontalAlignment.ALIGN_CENTER);
		
		Label nameLb=new Label("Name");
		ftable.setWidget(0, 0, nameLb);
		
		Label ageLb=new Label("Age");
		ftable.setWidget(1, 0, ageLb);
		
		Label genderLb=new Label("Gender");
		ftable.setWidget(2, 0, genderLb);
		
		this.name=new TextBox();
		this.name.setName(person.getName());
		ftable.setWidget(0, 1, this.name);
		
		this.age=new TextBox();
		this.age.setText(" "+person.getAge());
		ftable.setWidget(1, 1, age);
		
		this.gender=new TextBox();
		this.gender.setText(person.getGender());
		ftable.setWidget(2, 1, this.gender);
		
		Button saveBtn=new Button("Save");
		this.vPanel.add(saveBtn);
		this.vPanel.setCellHorizontalAlignment(saveBtn, HasHorizontalAlignment.ALIGN_CENTER);
		saveBtn.addClickHandler(new SaveClickHandler());
	}
	private class SaveClickHandler implements ClickHandler
	{
		
		@Override
		public void onClick(ClickEvent event) {
			saveData();
		}
		
	}
	private void saveData()
	{
		String name=this.name.getText();
		int age=(Integer.valueOf(this.age.getText()));
		String gender=this.gender.getText();
		mainview.getListiner().updatePersonInfo(name, age, gender);
	}
}
