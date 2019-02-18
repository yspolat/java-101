package it524.patterns.observer.ex1;

import java.util.Date;

public class MainClass {

	
	public static void main(String[] args) {
		
		//Button
		Tank tank = new Tank(100, 0);
		
		Pump pump1 = new Pump();
		Office office = new Office();
		
		tank.addTankListener(pump1);
		tank.addTankListener(office);
		
		tank.addTankListener(new TankListener() {
			
			@Override
			public void tankFilled(Date eventdate, double left) {
				System.out.println("Anonymous class fired..:" + eventdate);
				System.out.println("left: " + left);
				
			}
		});
		
		
		tank.fill(20);
		
		tank.fill(40);
		
		tank.fill(50);
		
		
		
	}
	
	
}
