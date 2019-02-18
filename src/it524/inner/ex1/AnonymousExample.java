package it524.inner.ex1;


public class AnonymousExample {

	public static void main(String[] args) {
		
		Cook cook = new Cook();
		
		cook.cookFood(new Eatable() {

			@Override
			public void howToCook() {
				System.out.println("Chicken soup");
				
			}
			
		});

		cook.cookFood(new Eatable() {
			
			@Override
			public void howToCook() {
				System.out.println("Kuzu Shish Charchoal");
				
			}
		});

		cook.setEatble(new Eatable() {
			
			@Override
			public void howToCook() {
				System.out.println("Spinach..");
				
			}
		});
		
		cook.getEatble().howToCook();
	}
	
}
