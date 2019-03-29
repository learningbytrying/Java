package com.learning.java;

import java.util.function.Function;

/**
 * compose() is the opposite of andThen
 * f1.compose(f2);
 * first apply f2 and then apply f1
 * @author Kapil
 *
 */
public class FunctionalChainingComposeEx {
	public static void main(String args[]) {
		//in place of Function<String,String> we can also use a unary operator
		Function<String, String> f1 = st -> st.substring(0, 5);
		Function<String, String> f2 = st1 -> st1.substring(0, 10);
		System.out.println(f1.compose(f2).apply("Kapil Kumar Reddy Poreddy"));

	}
}
