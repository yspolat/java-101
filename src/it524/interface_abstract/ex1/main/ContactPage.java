package it524.interface_abstract.ex1.main;

import java.util.Date;

public class ContactPage extends BasePage{

	private String contactInfo;
	
	public ContactPage(String content, String header, Date date,
			String contactInfo) {
		super(content, header, date);
		this.contactInfo = contactInfo;
	}

	@Override
	public void displayContent() {
		System.out.println(super.toString());
		System.out.println("Contact:" + contactInfo);

	}
	
}
