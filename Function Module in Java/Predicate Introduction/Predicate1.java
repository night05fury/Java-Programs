// Java program to illustrate Simple Predicate (since Java 8)

import java.util.function.Predicate;
public class Predicate1 {
	public static void main(String args[]) {
        // lambda expression with single parameter num
	   //String s = "successfully";
	   Predicate<String> s1 = (s) -> s.length()>10;  // lambda expression.
	   System.out.println(s1.test("successfully")); 
    }

}
//Predicate here means a condition that 
//we want to evaluate with the help of lambda exp.