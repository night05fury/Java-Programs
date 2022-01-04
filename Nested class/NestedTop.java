//Nested Top classes example

abstract class ShapeX{											//Top level class is ShapeX
	public abstract void area();
    private int x = 5;
   
    public class Circle1 extends ShapeX {                            //inner class
		double r;
		Circle1(double r){
			this.r = r ;
		}
		
		public void area() {                                         //overridden method.
			System.out.println("Circle area ="+(3.141*r*r));
		}
}
	public static class Rectangle extends ShapeX { 					//static nested class (nested-top level class)
		int length;
		int breadth;
		Rectangle(int length, int breadth){
			this.breadth = breadth; 
			this.length = length;
		}
		public void area() {										//overridden method
			System.out.println("Rectangle area ="+length*breadth);
		}
		
		
	}
}
public class NestedTop {
	public static void main(String[] args) {
		ShapeX aShape = new ShapeX.Rectangle(12, 13);  //we created an object of abstract class to keep the reference of nested sub-class (Rectangle).
		aShape.area();     
	
	//To instantiate an inner class, you must first instantiate the outer class. Then, create the inner object within the outer object 
		ShapeX.Circle1 c1 = aShape.new Circle1(2.0);
		c1.area();
		// object of nested top class and inner class can exist individually.
		Rectangle r1 = new Rectangle(4, 6); 
		r1.area();
		Circle1 c2 = new Circle1(3.0);
		c2.area();
		}
}
//Note: The object of abstract class can hold the references of derived (subclass) classes.
//While The abstract classes are generally meant for not instantiating the object.