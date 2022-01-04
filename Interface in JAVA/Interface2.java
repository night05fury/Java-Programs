
// Implementing Multiple Interfaces, default methods and static methods

interface Animal {
	//public static final String tname = " Hello";
	 void speed();                        // all methods here should be abstract; with no implementation. 
	 void name(String tname); // all methods or members are public
	 
	default void show() {
		 System.out.println("Hello! I am default method of Animal."); 
	 } 
}
interface FastAnimal {
	void run(int a);
	
	//interface can have default methods. 
	default void show() {
		System.out.println("Hello! I am default method of FastAnimal.");
	}
	//interface can have static methods as well
	static void roar() {
		System.out.println("I am static method of FastAnimal interface");
	}
}
class Tiger implements Animal, FastAnimal {
	// all methods must be implemented.
	int a;
	String y;
	public void name(String name) {
		this.y = name;
		System.out.println("My Name is " +y +" Tiger");
	}
	public void speed() {
		System.out.println("My Speed is High");
	}
	public void run(int x) {
		this.a=x;
		System.out.println("My speed in nearly "+a +" Km/h");
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		Animal.super.show();
		FastAnimal.super.show();
	}
}
//Driver class
public class Interface2 {
	public static void main(String[] args) {
		
		Tiger t1 = new Tiger();
		t1.name("White");
		t1.speed();
		t1.run(35);
		//Animal a = new Animal();  // this is not valid
		t1.show();							//calling default method
		FastAnimal.roar();			//calling static method
	}

}
