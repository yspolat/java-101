package it524.patterns.observer.ex1;

import java.util.Date;

public class Pump implements TankListener{
	
	
	
	

	@Override
	public void tankFilled(Date eventdate, double left) {
		System.out.println("Pump stopping at " + eventdate);
		
	}

	
	
	
	
	
}
