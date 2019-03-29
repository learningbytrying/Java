package com.learning.java;

import java.util.function.BiPredicate;

/**
 * As we know Predicate is a boolean valued functional interface which takes
 * only 1 input argument and returns a boolean , BiPredicate takes two input
 * arguments and returns a boolean and() , or() , negate() are also available in
 * BiPredicate however each of these take 2 arguments
 * 
 * In BiPredicate interface we don't have isEqual() method
 * 
 * @author Kapil
 *
 */
public class BiPredicateEx {

	public static void main(String args[]) {
		BiPredicate<String, String> bipred = (s1, s2) -> {
			return s1.length() > 5 && s2.length() > 5;
		};
		System.out.println(bipred.test("Kapil", "Reddy"));
	}

}
