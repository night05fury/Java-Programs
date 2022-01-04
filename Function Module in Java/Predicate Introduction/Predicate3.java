// Implementing Predicate in java

import java.util.function.Predicate;

public class Predicate3 {
	public static void main(String[] args) {
		int i = 89;
	 Predicate<Integer> pi = (val)-> (val>100);
	 System.out.println(pi.test(i));
	}
	
}