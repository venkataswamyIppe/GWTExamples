package com.project.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.project.client.service.ProjectServiceClientImpl;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTProject implements EntryPoint {
	
	public void onModuleLoad() {
		ProjectServiceClientImpl clientImpl=new ProjectServiceClientImpl(GWT.getModuleBaseURL()+"projectservice");
		RootPanel.get().add(clientImpl.getMainGUI());
		
	}
}
