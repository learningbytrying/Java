package com.learning.java;

public interface IStatic1 {

	/**
	 * This method is not available to the class that is implementing the interface
	 * Also this cannot be overridden by the class because it is no longer available
	 */
	static void m1() {
		System.out.println("Static Methods can also be used inside interfaces starting Java8");
	}
}
