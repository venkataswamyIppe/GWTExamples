package com.java.hello.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Sample implements EntryPoint {
	
	public void onModuleLoad() {
	      HTML html = new HTML("<p><center>Welcome to GWT application</center></p>");
	      
	      RootPanel.get("gwtContainer").add(html);
	   }
	}