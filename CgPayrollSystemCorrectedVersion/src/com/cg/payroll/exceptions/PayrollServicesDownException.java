package com.cg.payroll.exceptions;

public class PayrollServicesDownException extends Exception {
	public PayrollServicesDownException() {
		super();

	}

	public PayrollServicesDownException(String arg0, Throwable arg1,
			boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);

	}

	public PayrollServicesDownException(String arg0, Throwable arg1) {
		super(arg0, arg1);

	}

	public PayrollServicesDownException(String arg0) {
		super(arg0);

	}

	public PayrollServicesDownException(Throwable arg0) {
		super(arg0);

	}

}
