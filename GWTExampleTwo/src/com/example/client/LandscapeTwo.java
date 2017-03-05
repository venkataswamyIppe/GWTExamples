package com.example.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.VerticalPanel;
public class LandscapeTwo extends Composite {	
		private VerticalPanel vPanel=new VerticalPanel();
		private MainView main;
		public LandscapeTwo(MainView main)
		{
			initWidget(this.vPanel);
			this.main=main;
			Image img=new Image("/images/dd-team-ipl-2016.jpg");
			img.setWidth("600px");
			this.vPanel.add(img);
		}
}

