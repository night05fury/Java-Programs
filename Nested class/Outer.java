// Nested class example

public class Outer {
	
	static class NestedClass {
		
		public void my_message() {
			System.out.println("This is my message from nested class");
		}

	}
	public static void main(String[] args) {
		
		Outer.NestedClass x = new Outer.NestedClass();
				
		x.my_message();
	}

}

