// Java program to illustrate Simple Predicate 

import java.util.function.Predicate; 
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;


public class Predicate2 { 
	public static void main(String[] args) 
	{ 
		// Creating predicate 
		Predicate<Integer> lesserthan = i -> (i < 18); 

		// Calling Predicate method 
		System.out.println(lesserthan.test(10)); 
	} 
} 
