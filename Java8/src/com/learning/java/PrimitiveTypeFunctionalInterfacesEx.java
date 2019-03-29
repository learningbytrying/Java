package com.learning.java;

import java.util.function.IntPredicate;

/**
 * Predicate / Consumer / Supplier / Function are object Type Functional
 * interfaces To work with Primitives we can use PrimitiveTypeFunctional
 * Interfaces While working with primitives Object Functional interfaces are not
 * best in performance because each time autoboxing and unboxing is applied
 * which is a big cost and so the need to use Primitive Functional interfaces
 * arise
 * 
 * Some primitive functional interfaces are IntPredicate , longPredicate ,
 * intFunction , ToInt
 * 
 * There are about in all 15 primitive functional interfaces
 * 
 * This class is about one such example
 * @author Kapil
 *
 */
public class PrimitiveTypeFunctionalInterfacesEx {

	public static void main(String args[]) {
		IntPredicate ip = i->i>10;
		System.out.println(ip.test(11));
	}
}
