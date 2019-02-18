package it524.exception.ex2;

import java.util.Date;

public class DivideByZeroException extends Exception{

	private Date expDate;
	
	public DivideByZeroException(String message) {
		
		super(message);
		expDate = new Date();
	}

	public Date getExpDate() {
		return expDate;
	}
	
}
