// Input / Output using buffer reader in java

/**
 * 
 */

/**
 * @author ANAND
 *
 */
import java.io.*;
public class While {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		InputStreamReader istream = new InputStreamReader(System.in) ;
		BufferedReader bufRead = new BufferedReader(istream) ;
		
		try {
		System.out.println("Please Enter any Number to begin countdown: ");
		String num = bufRead.readLine();
		int  n = Integer.parseInt(num);
		System.out.println("Countdown");
		
		while(n>=0){
		System.out.println(n);
		n--;
		}
	
		}
		
		catch (IOException err) {
		System.out.println("Error reading line");
		}
		catch(NumberFormatException err) {
		System.out.println("Error Converting Number");
		}
		}
	
}











