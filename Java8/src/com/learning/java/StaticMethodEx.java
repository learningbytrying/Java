package com.learning.java;

/**
 * With Java8 we can also have static methods inside an interface
 * @author vn0aifb
 *
 */
public class StaticMethodEx implements IStatic1{

	public static void m1() {
		IStatic1.m1(); // this is the way to refer to static methods inside Interfaces
	}
	
	public static void main (String args[]) {
		StaticMethodEx.m1();
	}
}	
