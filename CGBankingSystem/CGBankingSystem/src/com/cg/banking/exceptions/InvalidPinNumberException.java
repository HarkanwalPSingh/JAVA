package com.cg.banking.exceptions;

@SuppressWarnings("serial")
public class InvalidPinNumberException extends Exception{

	public InvalidPinNumberException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidPinNumberException(String message) {
		super(message);
	}

	public InvalidPinNumberException(Throwable cause) {
		super(cause);
	}

	public InvalidPinNumberException() {
		super();
	}

}
