package com.learning.java;

public class DefaultMethodsEx implements DM1, DM2 {

	public void m1() {
		// Access the default methods in the interfaces as below , notice that the name
		// of the method is the same, this in a way also solves the problem with
		// multiple inheritance
		DM1.super.m1();
		DM2.super.m1();
	}

	public static void main(String args[]) {

		DefaultMethodsEx mie = new DefaultMethodsEx();
		mie.m1();
	}

}
