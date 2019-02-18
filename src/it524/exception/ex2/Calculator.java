package it524.exception.ex2;

public class Calculator {

	public double makeDivision(double x, double y) throws Exception{
		
		if(y==0) {
			throw new DivideByZeroException("Second number cannot be zero");
		}
		return x/y;
	}
}
