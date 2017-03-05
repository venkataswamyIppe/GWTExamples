package com.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.gwt.client.service.PersonServiceClientImpl;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTWeb implements EntryPoint {
	
	public void onModuleLoad() {
		PersonServiceClientImpl clientImpl=new PersonServiceClientImpl(GWT.getModuleBaseURL()+"personservice");
		RootPanel.get().add(clientImpl.getMainGUI());
		
		
		}
}
