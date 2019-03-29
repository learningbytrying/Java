package com.learning.java;

import java.util.function.Predicate;

/**
 * predicate has a method negate().test(<value>)
 * @author Kapil
 *
 */
public class PredicateNegateEx {
	
	public static void main(String args[]) {
		Predicate<Integer> p1 = p->p>10;
		System.out.println(p1.negate().test(4));
	}

}
