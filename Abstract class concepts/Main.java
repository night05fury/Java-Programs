// Abstract class use case with static method

abstract class ClassA {
    public void methodOne(int i) {
    }
    public void methodTwo(int i) {
       	System.out.println("I am A's method");
    }
    //public static void methodThree(int i) { 	// this cannot be overridden
    public static void methodFour(int i) {
    	
    }
}
class ClassB extends ClassA {
    //public static void methodOne(int i) {            //compile time error
    //}
    public void methodTwo(int i) {                  //this 2 will override
    	System.out.println("I am B's method");
    }
    //public void methodThree(int i) {				//compile time error
   // }
    public static void methodFour(int i) {         //will hide the superclass method.
    	
    }
   }
class Main{
	
	public static void main(String[] args) {
		
		ClassA a = new ClassB();
		a.methodTwo(9);
		
		//ClassB b = new ClassA();
		ClassA aa = new ClassB();
		aa.methodTwo(5);	
		
	}
}

