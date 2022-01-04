//add/sum the entered nos. with the help of sum method.

public class Varargs {
	public void sum(double ... args) {
		System.out.println(args.length);
		int sum =0;
		for(double i: args) {
			sum+=i; // sum = sum +i;
		}
		System.out.println("Sum  = "+sum); 
		//return sum;
	}
	public static void main(String[] args) {
		Varargs v = new Varargs();
		//double s1 = v.sum(12, 23);                     // argument length is 2
		//double s2 = v.sum(12, 15, 19, 15, 19, 89);     // argument length is 6.
		v.sum(12, 23); 
		v.sum(12, 15, 19, 15, 19, 89);
		//System.out.println("Sum s1 = "+s1);         
		//System.out.println("Sum s2 = "+s2);;
	}
}
