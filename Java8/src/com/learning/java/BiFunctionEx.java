package com.learning.java;

import java.util.function.BiFunction;

/**
 * Bi means two , so we have Bi interfaces in Java8 as well BiPredicate
 * BiFunction BiConsumer
 * 
 * Predicate takes only 1 argument where as BiPredicate takes two arguments and
 * returns either true or false same is the difference between
 * Function/BiFunction and Consumer/BiConsumer
 * 
 * BiFunction interface doesn't have a compose and identity methods that are
 * otherwise present in Function interface
 * 
 * the andThen() method for bi function chaining only takes a Function and not a
 * BiFunction
 * 
 * @author Kapil
 *
 */
public class BiFunctionEx {
	public static void main(String args[]) {

		BiFunction<String, String, Integer> biFn = (s1, s2) -> {
			return s1.length() + s2.length();
		};
		System.out.println(biFn.apply("Kapil", "Reddy"));

	}
}
