// java program to show UnaryOperator 

import java.util.function.UnaryOperator;
public class UnaryOperator1 {

	public static void main(String args[]) {
		
		UnaryOperator<String> uOp = t -> t.substring(0,2);
		System.out.println(uOp.apply("Hello"));	
	}
}
