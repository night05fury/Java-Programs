package ASSIGN_MOM;

import java.util.Scanner;

public class MOM extends FamilyMember{
	public static void main (String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Family Member Count"); /*counting of family members thus 
															same amount of votes*/
		int FMCount=sc.nextInt();
		FamilyMember FM=new FamilyMember(); //object creation of FamilyMember class
		FM.DishChoice(); //calling method DishChoice from FamilyMember Class
		
        for(int k=0;k<FMCount;k++) //k = 9 , NUMBER OF FAMILY MEMEBERS
        {
        	FM.ChoiceEnter(); //calling choice entering function 
        }
        FM.Votes();		////calling voting function and deciding which dish is made.
	}
	
}
