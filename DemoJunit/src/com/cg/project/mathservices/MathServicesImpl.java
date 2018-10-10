package com.cg.project.mathservices;

public class MathServicesImpl implements MathServices{

	@Override
	public int addNumbers(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

	@Override
	public int subtractNumbers(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}

	@Override
	public int multiplyNumbers(int n1, int n2) {
		int result = n1* n2;
		return result;
	}

}
