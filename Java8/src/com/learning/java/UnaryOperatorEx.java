package com.learning.java;

import java.util.function.UnaryOperator;

/**
 * If in a function if the input type and the return type are the same type then
 * we can avoid using Function instead use the child interface of the Function
 * Interface which is UnaryOperator interface , this unary operator only accepts
 * objects though , there is also equivalent primitive unary like IntUnary /
 * LongUnary/DoubleUnary and has corresponding applyAs***() methods
 * 
 * @author Kapil
 *
 */
public class UnaryOperatorEx {

	public static void main(String args[]) {
		UnaryOperator<Integer> fn = f -> f * f;
		System.out.println(fn.apply(10)); // ideally if we were using a function , we would have used
											// Function<Integer,Integer>
	}
}
