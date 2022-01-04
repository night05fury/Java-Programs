// Lambda expression in String and interface

//Functional interface 
interface StringLength1 {

    boolean strlen(String a);  // There is only one abstract method. 
}


//driver class
public class StringLambda {
	public static void main(String args[]) {
        // lambda expression with multiple arguments
    	StringLength1 s = (str1) -> str1.length()>10;
    	   	
        System.out.println("Result: "+s.strlen("HelloOOOOOOOOOOOOOOOO"));
    }
}
