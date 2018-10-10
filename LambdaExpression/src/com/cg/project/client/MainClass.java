package com.cg.project.client;

import com.cg.project.lambdainterface.FunctionalInterface1;

public class MainClass {

	public static void main(String[] args) {
		FunctionalInterface1 ref1 = (a,b)-> (a>b)?a:b;
		System.out.println(ref1.Maxfunction(100, 200));

	}

}
