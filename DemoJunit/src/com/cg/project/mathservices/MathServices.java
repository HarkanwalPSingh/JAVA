package com.cg.project.mathservices;

public interface MathServices {
	public int addNumbers(int n1,int n2);
	abstract int subtractNumbers(int n1,int n2);
	public abstract int multiplyNumbers(int n1, int n2);
	/*  NO NEED TO SPECIFY PUBLIC AND ABSTRACT THEY ARE BY DEFAULT 
	 * INTERFACE'S FEATURE FOR ITS METHODS*/
}
