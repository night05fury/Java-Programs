package ASSIGN_MOM;
import java.util.Scanner;
//import javax.swing.*;
//import java.math.*;
public class FamilyMember extends DishMenu
{	
	
	 int C1 = 0,C2 = 0,C3 = 0,C4 = 0,C5 = 0,C6=0;
	 int ch=0;
	 DishMenu DM= new DishMenu();
	public  void DishChoice()
	{   
		DM.DishDisplay();
		//System.out.println("Show the Dishes' List");
		
		
		System.out.println(" ");
		System.out.println("Enter 1 for First Dish , 2 For Second Dish and so on");
		
    }
    public void ChoiceEnter()
    {
           
		Scanner scan=new Scanner(System.in);
       ch = scan.nextInt();
       if(ch>0 && ch<5)
       {
		switch (ch)
		{
		case 1:
			C1++;
			System.out.println("Dish 1 Voted");
            break;
        case 2:
            C2++;
            System.out.println("Dish 2 Voted");
            break;
        case 3:
            C3++;
            System.out.println("Dish 3 Voted");
            break;
        case 4:
            C4++;
            System.out.println("Dish 4 Voted");
            break;
        
        default:
            System.out.println(" ");
        }
    }else
    {
    	System.out.println("Enter Valid Choice");
    }
    }
    
    
    public void Votes()
    {
        
        /*int MaxVotes=0;
        MaxVotes=Math.max(C1, C2);
        MaxVotes=Math.max(MaxVotes,C3);
        MaxVotes=Math.max(MaxVotes,C4);
        MaxVotes=Math.max(MaxVotes,C5);
        MaxVotes=Math.max(MaxVotes,C6);*/
       
    	if(C1>C2 && C1>C3 && C1>C4)
        System.out.println("Dish 1 "+ DishAvai[0]+" Will be Prepared because it has got "+C1+" votes");
        else if(C2>C1 && C2>C3 && C2>C4)
        System.out.println("Dish 2 "+ DishAvai[1]+" Will be Prepared because it has got "+C2+" votes");
        else if(C3>C1 && C3>C4 && C3>C2)
        System.out.println("Dish 3 "+ DishAvai[2]+" Will be Prepared because it has got "+C3+" votes");
        else if(C4>C2 && C4>C3 && C4>C1)
        System.out.println("Dish 4 "+ DishAvai[3]+" Will be Prepared because it has got "+C1+" votes");
        else
            System.out.println("NO FOod Available Today , Order from Restaurant");
    	
    	//else if(MaxVotes==C5)
        //System.out.println("Dish 5 Will be Prepared");
        //else if(MaxVotes==C6)
        //System.out.println("Dish 6 Will be Prepared");
        
    }
 

	
}
