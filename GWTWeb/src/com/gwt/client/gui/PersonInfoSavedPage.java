package com.gwt.client.gui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class PersonInfoSavedPage extends Composite
{
	private MainView mainview;
	private VerticalPanel vPanel=new VerticalPanel();
	
	public PersonInfoSavedPage(MainView mainview)
	{
		initWidget(this.vPanel);
		this.mainview=mainview;
		
		Label titleLb=new Label("Person Information Saved");
		this.vPanel.add(titleLb);
		this.vPanel.setCellHorizontalAlignment(titleLb, HasHorizontalAlignment.ALIGN_CENTER);
		
		Button backBtn=new Button("Back");
		this.vPanel.add(backBtn);
		this.vPanel.setCellHorizontalAlignment(backBtn, HasHorizontalAlignment.ALIGN_CENTER);
		backBtn.addClickHandler(new BackBtnClickHandler());
		
	}
	private class BackBtnClickHandler implements ClickHandler
	{

		@Override
		public void onClick(ClickEvent event) {
			mainview.openPersonInfoPage();
			
		}
		
	}
}
