// Implementing Lambda expression in functional interface

import java.util.function;

interface MyInterface1 {   // functional interface 
	//A method with no parameter
    String sayHello();
}


//Driver /main class

public class Lambda2 {

   public static void main(String args[]) {
        // lambda expression
	      
	   //Here i created a variable of type functional interface
	   
	  MyInterface1 msg = () -> { return "Hello Everyone !!!!!!!!!!!!!!";};
    	   	
        System.out.println(msg.sayHello());
    }
}

