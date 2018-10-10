package com.cg.banking.exceptions;

@SuppressWarnings("serial")
public class InvalidAmountException extends Exception{

	public InvalidAmountException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvalidAmountException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidAmountException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InvalidAmountException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
