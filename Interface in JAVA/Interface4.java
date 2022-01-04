// Implementing Multiple Interfaces
interface WildAnimal {
	public static final String name = " Hello";
	 void speed(); // all methods here should be abstract; with no implementation. 
	void name(String tname); // all methods or members are public
	 default void show() {
		 System.out.println("Hello! I am default method of Wild Animal."); 
	 }
}
interface CatAnimal {
	void run(int a);
	//interface can have default methods. 
	default void show() {
		System.out.println("Hello! I am default method of Cat Animal.");
	}
	//interface can have static methods as well
	static  void sound() {
		System.out.println("Hi! I am sound method of CatAnimal.");
	}
}


class Lion implements WildAnimal, CatAnimal {
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
		WildAnimal.super.show();
		CatAnimal.super.show();
	}
	
	
}
//Driver class
public class Interface4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion l1 = new Lion();
		
		l1.name("White");
		l1.speed();
		l1.run(35);
		//Animal a = new Animal();  // this is not valid
		l1.show();					//calling default method
		CatAnimal.sound();			//calling static method
	}

}
