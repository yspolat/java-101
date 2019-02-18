package it524.exception.ex2;

public class CalculatorMainClass {

	public static void main(String[] args){
		
		
		Calculator calc = new Calculator();
		
		MathOperations op = new MathOperations();
		try {
			op.doOperation1();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
			System.out.println(calc.makeDivision(3, 0));
		}catch (DivideByZeroException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getExpDate());
		} 
		
		catch (Exception e) {
			e.getMessage();

		}
	}
}
