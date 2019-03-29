package com.learning.java;

import java.util.function.Predicate;

/**
 * Sample class to discover the usage of the static method isEqual of Predicate interface
 * @author Kapil
 *
 */
public class PredicateisEqualEx {
	
	public static void main(String args[]) {
		Predicate<String> p = Predicate.isEqual("Kapil");
		System.out.println(p.test("Kapil"));
	}
	

}
