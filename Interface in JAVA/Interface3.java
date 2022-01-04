// Program to show use of multiple Inheritance

interface Animal {
	void sound(); // no implementation / the methods don't have bodies // by default interface methods are abstract and public
	void speed(); 
	//interface cannot contain constructor
}
interface FastAnimal{
	void run();
}
class Tiger implements Animal, FastAnimal {

	public void sound () {
		System.out.println("Roar");             //it is compulsory to override all the methods.
	}
	public void speed() 
	{
		System.out.println("Speed is High");
	}
	public void run() {
		System.out.println("It is Fast running animal");
	}
}
//Driver class
class Interface3 {
	public static void main(String[] args) {
		Tiger t1 = new Tiger();
		t1.speed();
		t1.run();
		// Animal a = new Animal(); //not valid	
	}
}
