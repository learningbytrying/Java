package com.learning.java;

import java.util.function.Function;

/**
 * Sample class to understand the usage of functions in Java8 .Function is same
 * as Predicate except for that it takes a Type T and Returns R and that R can
 * be of any type and not just a boolean
 * 
 * The semantics is
 * 
 * T is the input type , R is the return type in the example below the function
 * takes a string and returns Integer
 * 
 * Functions can also be chained and this is called Functional chaining
 * 
 * apply() is the only abstract method in the Functional interface
 * 
 * For functional chaining we use .andThen()/.compose() are default methods in
 * the functional interface interface Function<T,R> {
 * 
 * R apply(T t);
 * 
 * }
 * 
 * There is an identity() method in the Function interface which is a static
 * method and this returns the function , need to check what's the use
 * 
 * @author Kapil
 *
 */
public class FunctionEx {

	public static void main(String args[]) {

		Function<String, Integer> f = String::length; // or str -> str.length();
		System.out.println(f.apply("Kapil"));
	}

}
