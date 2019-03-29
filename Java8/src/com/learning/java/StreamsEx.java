package com.learning.java;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * has two methods filter() , map() stream() is default method in the Streams
 * interface
 * 
 * filter takes a predicate for map -> if we want to create a new object for
 * every object present in the collection based on some function then we should
 * go for a map
 * 
 * few important methods in streams are collect() , as an example takes
 * Collectors.toList/ count()
 * 
 * count() returns the number of elements in the stream
 * 
 * sorted() -> to sort elements in a stream or pass a comparator for customized
 * sorting
 * 
 * Stream.Of() -- to generate a stream out of group of values like generate
 * stream from an array
 * 
 * @author Kapil
 *
 */
public class StreamsEx {

	public static void main(String args[]) {
		ArrayList<String> als = new ArrayList<>();
		als.add("Kapil");
		als.add("Pihu");
		als.add("Gunnu");
		System.out.println(als.stream().filter(s->s.length()>4).collect(Collectors.toList()).get(0));
		System.out.println(als.stream().filter(s->s.length()>4).collect(Collectors.toList()).get(1));
		
		
	}
}
