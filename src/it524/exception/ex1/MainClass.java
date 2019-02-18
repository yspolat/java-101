package it524.exception.ex1;

public class MainClass {

	public static void main(String[] args) {
		
		
		int[] numbers = {1,2,3,4};
		
		
		try {
			System.out.println(numbers[5]);
			
			//Object o = null;
			
			//o.getClass();
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array error");
		} 
		
		catch (Exception e) {
			
			System.out.println("Another error");
			
			
		}finally {
			//Always called
			System.out.println("Finally block...");
		}

	}
	
	
	
}
