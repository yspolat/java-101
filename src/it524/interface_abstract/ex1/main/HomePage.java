package it524.interface_abstract.ex1.main;

import java.util.Date;

public class HomePage extends BasePage{
	String welcomeText;
	public HomePage(String content, String header, Date date,
			String welcomeText) {
		super(content, header, date);
		this.welcomeText = welcomeText;
	}

	
	
	@Override
	public void displayContent() {
		System.out.println(super.toString());
		System.out.println("Welcome:" + welcomeText);
		
	}

}
