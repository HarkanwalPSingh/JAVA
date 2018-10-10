package com.cg.exceptionExample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {
	public static void main(String[] args){
		try{
			Scanner ref = new Scanner(System.in);
			System.out.println("Enter Number: ");
			int n1 = ref.nextInt();
			System.out.println("Enter Number: ");
			int n2 = ref.nextInt();
			System.out.println(n1/n2);
		}
		catch (ArithmeticException e){
			e.printStackTrace();
			System.out.println("Second number must be other than zero");
		}
		catch (InputMismatchException c){
			c.printStackTrace();
			System.out.println("Numbers must be integers");
		}
		catch(Exception d){
			d.printStackTrace();
			System.out.println("Other exception");
		}
		finally{
			System.out.println("Code after exception");
		}
			
	}

}
