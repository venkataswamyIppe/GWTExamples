package com.example.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MainView extends Composite {
	
	private VerticalPanel vPanel=new VerticalPanel();
	private VerticalPanel contentPanel;
	public MainView()
	{
		initWidget(this.vPanel);
		this.vPanel.setBorderWidth(1);
		MenuView menu=new MenuView(this);
		this.vPanel.add(menu);
		this.contentPanel=new VerticalPanel();
		this.vPanel.add(contentPanel);
		Label txtlb1=new Label("press a button to see a nice landscape");
		this.contentPanel.add(txtlb1);
	}
	public void landscapeOne()
	{
		this.contentPanel.clear();
		LandscapeOne page1=new LandscapeOne(this);
		this.contentPanel.add(page1);
	}
	public void landscapeTwo()
	{
		this.contentPanel.clear();
		LandscapeTwo page2=new LandscapeTwo(this);
		this.contentPanel.add(page2);
	}
}
