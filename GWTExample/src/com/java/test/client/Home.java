package com.java.test.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.datepicker.client.DatePicker;

public class Home implements EntryPoint {

	 public void onModuleLoad() {
		 // Create a date picker
		    DatePicker datePicker = new DatePicker();
		    MenuBar menu=new MenuBar();
		    Command cmd=new Command(){

				@Override
				public void execute() {
					Window.alert("click it");
				}
		    	
		    };
		    MenuBar menuFile=new MenuBar(true);
		    menuFile.addItem(new MenuItem("New",cmd));
		    menuFile.addItem(new MenuItem("Open",cmd));
		    menuFile.addItem(new MenuItem("Old",cmd));
		    menu.addItem("File", menuFile);
		    menu.addItem("Edit", menuFile);
		    menu.addItem("Save", menuFile);
		    RootPanel.get().add(datePicker);
		    RootPanel.get().add(menu);
		    
		  }

}
