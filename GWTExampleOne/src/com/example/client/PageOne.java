package com.example.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class PageOne extends Composite {
	private VerticalPanel vPanel=new VerticalPanel();
	private Label lb;
	private Button btn1;
	private Button btn2;
	public PageOne()
	{
		PageTwo ptwo=new PageTwo();
		initWidget(this.vPanel);
		vPanel.setBorderWidth(1);
		
		Image img=new Image("/images/venkat.PNG");
		lb=new Label("Hello Venkat how are U..");
		btn1=new Button("click me");
		btn2=new Button("touch me");
		btn1.addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				Window.alert("u touched me");
				
			}
		}	
				);
		btn2.addMouseOverHandler(new MouseOverHandler(){
			@Override
			public void onMouseOver(MouseOverEvent event) {
			Window.alert("on mouse over action");
			}
		});
		TextBox txb=new TextBox();
		vPanel.add(img);
		vPanel.add(lb);
		vPanel.add(txb);
		vPanel.add(btn1);
		vPanel.add(btn2);
		vPanel.add(ptwo);
	}

}
