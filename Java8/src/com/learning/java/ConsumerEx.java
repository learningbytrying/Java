package com.learning.java;

import java.util.function.Consumer;

/**
 * Predicate and Function both return a type either a Boolean or any other Type
 * if you don't want any return type use a Consumer
 * 
 * has a single abstract method accept(T t) , takes an input of any type T and
 * returns nothing J Just like Predicate joining and Functional chaining we can
 * chain consumers as well
 * 
 * c1.andThen(c2).andThen(c3);
 * 
 * @author Kapil
 *
 */
public class ConsumerEx {
	public static void main(String args[]) {
		Consumer<String> c = System.out::print;
		c.accept("Kapil");
	}

}
