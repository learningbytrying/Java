package com.learning.java;

import java.util.function.Function;

/**
 * f1.andThen(f2) on the result of f1, f2 is applied
 * 
 * compose is the reverse of andThen
 * @author Kapil
 *
 */
public class FunctionalChainingAndThenEx {

	public static void main(String args[]) {
        
		//in place of Function<String,String> we can also use a unary operator
		Function<String, String> f1 = st -> st.substring(0, st.length());
		Function<String, String> f2 = st1 -> st1.substring(0, 5);
		System.out.println(f1.andThen(f2).apply("Kapil Kumar Reddy Poreddy"));

	}
}
