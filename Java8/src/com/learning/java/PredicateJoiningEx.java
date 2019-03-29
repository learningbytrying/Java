package com.learning.java;

import java.util.function.Predicate;

/**
 * Predicate Joining is the way of combining multiple Predicates together
 * ex: p1.and(p2).test(<value>);
 * p1.or(p2).test(<value>);
 * 
 * .and() -- is to combine two predicates
 * .or() -- also to combine two predicates
 * @author Kapil
 *
 */
public class PredicateJoiningEx {
	
	public static void main(String args[]) {
		Predicate<Integer> p1 = i -> i > 10;
		Predicate<Integer> p2 = i -> i> 20;
		System.out.println(p1.and(p2).test(4)); //false
		System.out.println(p1.and(p2).test(11)); //false
		System.out.println(p1.or(p2).test(11));  //true
	}
	
	
	

}
