package it524.patterns.observer.ex1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tank {

	private double capacity;
	private double filled;
	
	
	List<TankListener> listeners;
	
	public Tank(double capacity, double filled) {
		super();
		this.capacity = capacity;
		this.filled = filled;
		listeners = new ArrayList<>();
	}
	
	
	public void addTankListener(TankListener listener) {
		this.listeners.add(listener);
	}
	

	
	
	public void fill(double amount) {
		System.out.println("Capacity:" + capacity);
		System.out.println("Filled:" + filled );
		
		if(capacity-filled>=amount) {
			filled +=amount;
		}else {
			
			filled = 100;
			double leftover =  amount - (capacity-filled);
			//Fire events
			System.out.println("Tank:Tank filled");
			Date now = new Date();
			for (TankListener tankListener : listeners) {
				
				tankListener.tankFilled(now, leftover);
			}
			
			
		}
		
		
		
		
	}
	
	
	
	
	
}
