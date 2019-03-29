package com.learning.java;

import java.util.function.Predicate;

/**
 * This is an example to learn about Predicate predicate is one of the
 * functional interfaces , other functional interfaces are Function / Consumer /
 * Supplier Functional interfaces can have any number of default methods , any
 * number of static methods however it can only have one abstract method
 * 
 * Runnable / Callable and Comparable are the functional interfaces that existed
 * even before Java8
 * 
 * @author Kapil
 * 
 *         Predicate is a boolean valued Function This performs a conditional
 *         check , tests and returns either TRUE or FALSE
 * 
 *         Predicate has only one abstract method i.e. test() boolean test(T t);
 *         and() , or() , negate() are all default methods in the predicate
 *         interface
 * 
 *         There is also a static method in the Predicate interface i.e. isEqual
 * 
 *         Predicate is a boolean valued function , it can only return true or
 *         false , so if you want to return any type use a Function
 *
 */
public class PredicateEx {
	public static void main(String args[]) {
		Predicate<Integer> testingNumber = p -> p > 10;
		System.out.println(testingNumber.test(11));

	}

}
