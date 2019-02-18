package it524.patterns.observer.ex1;

import java.util.Date;


//Observer: Form, another class, anonymous
public class Office implements TankListener{

	
	@Override
	public void tankFilled(Date eventdate, double left) {
		System.out.println("Office got informed tank is filled: " + eventdate);
		
	}
	
}
