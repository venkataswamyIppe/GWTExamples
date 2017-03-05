package com.project.client.gui;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.project.client.model.PersonInfo;
import com.project.client.service.ProjectServiceClientImpl;


public class MainGUI extends Composite {
	private VerticalPanel vPanel=new VerticalPanel();
	private TextBox txb;
	private TextBox tb1;
	private TextBox tb2;
	private TextBox tb3;
	private TextBox tb4;
	private Label msgLb;
	private Label sumLebel;
	private Label avgLabel;
	TextBox familyNameTxt;
	ProjectServiceClientImpl serviceImpl;
	public MainGUI(ProjectServiceClientImpl serviceImpl)
	{
		this.serviceImpl=serviceImpl;
		initWidget(this.vPanel);
		this.txb=new TextBox();
		this.vPanel.add(txb);
		Button btn=new Button("send message greeting");
		btn.addClickHandler(new BtnClickHandler());
		this.vPanel.add(btn);
		msgLb=new Label("Message result will be here");
		this.vPanel.add(msgLb);
		this.tb1=new TextBox();
		this.vPanel.add(tb1);
		this.tb2=new TextBox();
		this.vPanel.add(tb2);
		Button bt=new Button("Add two Numbers");
		bt.addClickHandler(new AddBtnClickHandler());
		this.vPanel.add(bt);
		sumLebel=new Label("sum result will display here");
		this.vPanel.add(sumLebel);
		this.tb3=new TextBox();
		this.vPanel.add(tb3);
		this.tb4=new TextBox();
		this.vPanel.add(tb4);
		Button btns=new Button("Average two Numbers");
		btns.addClickHandler(new AvgBtnClickHandler());
		this.vPanel.add(btns);
		avgLabel=new Label("average of two numbers");
		this.vPanel.add(avgLabel);
		familyNameTxt=new TextBox();
		this.vPanel.add(familyNameTxt);
		Button bioDataBtn=new Button("Get BioData");
		bioDataBtn.addClickHandler(new bioDataClickHandler());
		this.vPanel.add(bioDataBtn);
	}
	public void updateLabel(String greeting)
	{
		this.msgLb.setText(greeting);
	}
	public void updateSum(int sum)
	{
		this.sumLebel.setText(""+sum);
	}
	public void updateAvg(double avg)
	{
		this.avgLabel.setText(""+avg);
	}
	public void displayPersonalInfo(PersonInfo info)
	{
		HTML html=new HTML();
		String code="<b>Name :</b>"+info.getName()+"</br>";
		code=code+"<b>Age :</b>"+info.getAge()+"</br>";
		code=code+"<b>Gender :</b>"+info.getGender()+"</br>";
		html.setHTML(code);
		this.vPanel.add(html);
	}
	public class BtnClickHandler implements ClickHandler{
		@Override
		public void onClick(ClickEvent event) {
			String familyName=txb.getText();
			serviceImpl.sayHello(familyName);
		}
	}
	public class AddBtnClickHandler implements ClickHandler{
		@Override
		public void onClick(ClickEvent event) {
			int a =Integer.valueOf(tb1.getText());
			int b=Integer.valueOf(tb2.getText());
			serviceImpl.addTwoNumbers(a, b);
		}
	}
	public class AvgBtnClickHandler implements ClickHandler {
		@Override
		public void onClick(ClickEvent event) {
			double a=Double.valueOf(tb3.getText());
			double b=Double.valueOf(tb4.getText());
			serviceImpl.avgTwoNumbers(a, b);
		}
	}
	public class bioDataClickHandler implements ClickHandler{
		@Override
		public void onClick(ClickEvent event) {
			String familyName=familyNameTxt.getText();
			serviceImpl.getPersonInfo(familyName);
		}
	}
}