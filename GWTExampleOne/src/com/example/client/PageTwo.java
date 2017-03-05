package com.example.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;

public class PageTwo extends Composite {

	 private HorizontalPanel hPanel=new HorizontalPanel();
	 public PageTwo()
	 {
		 initWidget(this.hPanel);
		 hPanel.setBorderWidth(1);
		 FlexTable ft=new FlexTable();
		 Label lb1=new Label("1");
		 Label lb2=new Label("2");
		 Label lb3=new Label("3");
		 Label lb4=new Label("4");
		 ft.setWidget(0, 0, lb1);
		 ft.setWidget(0, 1, lb2);
		 ft.setWidget(1, 0, lb3);
		 ft.setWidget(1, 1, lb4);
		 hPanel.add(ft);
		 
	 }
	

}
