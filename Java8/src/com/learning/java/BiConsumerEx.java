package com.learning.java;

import java.util.function.BiConsumer;

/**
 * Same like Consumer , has accept method that takes two parameters also
 * chaining is available through andThen()
 * 
 * @author Kapil
 *
 */
public class BiConsumerEx {
	public static void main(String args[]) {
		BiConsumer<String, String> biC = (s1, s2) -> {
			System.out.println(s1);
			System.out.println(s2);
		};

		biC.accept("Kapil", "Reddy");
	}
}
