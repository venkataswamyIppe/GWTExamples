package com.example.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTExampleTwo implements EntryPoint {
	
	
	public void onModuleLoad() {
		
		MainView main=new MainView();
		RootPanel.get().add(main);
	}
	
			
}
