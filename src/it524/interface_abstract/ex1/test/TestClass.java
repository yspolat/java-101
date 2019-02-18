package it524.interface_abstract.ex1.test;

import it524.interface_abstract.ex1.main.ContactPage;
import it524.interface_abstract.ex1.main.HomePage;
import it524.interface_abstract.ex1.main.WebServer;

import java.util.Date;

public class TestClass {

	
	public static void main(String[] args) {


		// BasePage Displayable implement ediyor, Contact Page ve Home Page'de BasePage extends ediyor.
		// BasePage abstract ancak icerisinde abstract bir method yok. Buna ragmen, HomePage ve ContactPage Displayable icerisindeki
		// displayContent method'unu override etmek zorundadir.
		
		WebServer server = new WebServer();
		
		
		HomePage homePage = 
				new HomePage("home content", 
						"Home Page", new Date(), "Welcome");
		
		ContactPage contactPage = 
				new ContactPage("contact content", 
						"Contact Page", new Date(), "Cxx@gg.com");
		
		server.loadPage(homePage);
		server.loadPage(contactPage);
	
	}
	
	
}
