package com.learning.java;

import java.util.Date;
import java.util.function.Supplier;

/**
 * Supplier is also a functional interface and has a single abstract method
 * get() it doesn't take any input however gives you a return type A good
 * example would be to generate Date
 * 
 * @author Kapil
 *
 */
public class SupplierEx {

	public static void main(String args[]) {
		Supplier<Date> sup = () -> new Date();
		System.out.println(sup.get()); // To remind Java 8 has a new feature called JODA Time API
	}

}
