package com.example.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;

public class LandscapeOne extends Composite {
	
	private VerticalPanel vPanel=new VerticalPanel();
	private MainView main;
	public LandscapeOne(MainView main)
	{
		initWidget(this.vPanel);
		this.main=main;
		Image img=new Image("/images/kings-XI-punjab.jpg");
		img.setWidth("600px");
		this.vPanel.add(img);
	}

}
