package com.learning.java;

import java.util.function.Consumer;

/**
 * c1.andThen(c2).andThen(c3)
 * 
 * @author Kapil
 *
 */
public class ConsumerChainingEx {
	public static void main(String args[]) {
		Consumer<String> c1 = System.out::print;
		Consumer<String> c2 = System.out::print;
		Consumer<String> c3 = System.out::print;
		c1.andThen(c2).andThen(c3).accept("Kapil");
	}
}
