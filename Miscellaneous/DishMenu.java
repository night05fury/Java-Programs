package ASSIGN_MOM;
import java.util.*;

//import javax.swing.JOptionPane;

public class DishMenu {
	
		
		//String Dish1, Dish2,Dish3,Dish4 ,Dish5 ,Dish6;
		int a;
		String [] DishList=new String [8];
		static String [] DishAvai= new String[4];
		//static String [] food=new String[4];
		public void DishEntry(){
		//String [] Breakfast =new String[]{"Bread and Butter" , "Omlette ", "Ham and Bacon" , "Sausages" ,"Pie" , "Eggs and Milk"};
		//String [] Lunch =new String[]{"Mushroom Burger" , "Omlette ", "Ham and Bacon" , "Sausages" ,"Pie" , "Eggs and Milk"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Dishes to Dish List");
		for(int i = 0; i<8;i++)
		{
			DishList[i]=sc.next();
		}
			
		}
		public void randomNo()
	    {
	        //selecting random value
	                Random rand = new Random();
	                a = rand.nextInt(DishList.length);
	    }
       
       
		public  void DishDisplay()
		{
				DishEntry(); //calling dish entry function here 
				System.out.println("----Dishes Available are---");
				
				for(int i = 0; i<4;i++)
				{	
					randomNo();
					DishAvai[i]=DishList[a];
					System.out.println((i+1)+" >> "+DishList[a]);
					/*JOptionPane.showMessageDialog(null,DishAvai[0]+"\n"+DishAvai[1]+"\n"+"\n"+DishAvai[2]+"\n"+DishAvai[3]); showing only 4 dishes 
					
							to be made from list of 8*/
					 }
					
		}
		
	
		
}  
	

