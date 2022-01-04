// String concatenation using lambda expression

interface StringConcat {

    String sconcat(String a, String b);
}


//driver class
public class Lambda4 {
	
   public static void main(String args[]) {
        // lambda expression with multiple arguments
    	StringConcat s = (str1, str2) -> str1 + str2;
    	   	
        System.out.println("Result: "+s.sconcat("Hello ", "World XYZ"));
    }
}
