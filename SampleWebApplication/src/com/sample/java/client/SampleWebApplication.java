package com.sample.java.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class SampleWebApplication implements EntryPoint {
	/* vertical panel that hold other components over UI.*/
	    VerticalPanel vPanel;
	/*    A label that gets updated on click of button.*/
	    Label lbl;
	    /*This is the entry point method.*/
	    public void onModuleLoad() {
	        vPanel = new VerticalPanel();
	        lbl = new Label();
	       /* Button and its click handlar.*/
	        Button btn = new Button("GWT Button");
	        btn.addClickHandler(new ClickHandler() {

				@Override
				public void onClick(ClickEvent event) {
					lbl.setText("You clicked GWT Button!");
					
				}
	    });
	        /*adding label and button into Vertical Panel.*/
	        vPanel.add(lbl);
	        vPanel.add(btn);
	        /*Adding vertical panel into HTML page.*/
	        RootPanel.get().add(vPanel);
	    }
}

