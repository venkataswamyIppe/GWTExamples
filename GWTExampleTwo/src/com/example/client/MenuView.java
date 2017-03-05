package com.example.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;

public class MenuView extends Composite {
	
	private HorizontalPanel hPanel=new HorizontalPanel();
	private MainView main;
	public MenuView(MainView main)
	{
		initWidget(this.hPanel);
		this.main=main;
		Button landscapeBtn1=new Button("Landscape 1");
		this.hPanel.add(landscapeBtn1);
		landscapeBtn1.addClickHandler(new LS1ClickHandler());
		Button landscapeBtn2=new Button("Landscape 2");
		landscapeBtn2.addClickHandler(new LS2ClickHandler());
		this.hPanel.add(landscapeBtn2);
		
	}
	private class LS1ClickHandler implements ClickHandler{

		@Override
		public void onClick(ClickEvent event) {
			main.landscapeOne();
		} 
	}
	private class LS2ClickHandler implements ClickHandler
	{
		@Override
		public void onClick(ClickEvent event) {
		main.landscapeTwo();
	    } 
	}
}
