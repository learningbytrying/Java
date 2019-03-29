package com.learning.java;

import java.util.function.BinaryOperator;

/**
 * if Unary operator is a replacement of Function , BinaryOperator is a
 * replacement of BiFunction and there are equivalent primitive binary operator
 * interfaces as well
 * 
 * this has a method apply(T t1 , T t2)
 * that means 1st input is of type t1 , second input of type t1 and return type is t2
 * @author kapil
 *
 */
public class BinaryOperatorEx {
	public static void main(String args[]) {

		BinaryOperator<String> biO = (s1,s2) -> {
			return s1+ s2;
		};
		System.out.println(biO.apply("Kapil", "Reddy"));
	}
}
