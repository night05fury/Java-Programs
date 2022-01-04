//Immutable classes
final class Driver {
	 private final int eid;
	 private final String ename;

	 
	 public int get_eid() {
		return eid;
	}
	
	public String get_ename() {
		return ename; 
	}

	Driver(int eid, String ename){
		this.eid = eid;
		this.ename = ename;
}
}

class Immutable {
	  public static void main(String[] args) {
	    // create object of Immutable
	    Driver obj = new Driver(211, "Bhoot");
	    
	    System.out.println("ID: " + obj.get_eid());              //accessor methods
	    System.out.println("Name: " + obj.get_ename());
	    
	  }
	}
