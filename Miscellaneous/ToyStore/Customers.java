package ToyStore;

import java.util.Scanner;
public class Customers extends ToyStore{
        static String gender;
        static int age;
        static double priceInput;
        public void input()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("WELCOME TO GUCCI TOY STORE!");
            System.out.println("Enter your child's age: ");
            age = sc.nextInt();
            if(age<=13 && age>=3) //assuming that maximum and minimum age for a child are 13y and 6y respectively
            {
                boolean x = true;
                while(x)
                {
                    System.out.println("Enter your child's gender (Male/Female) :");
                    gender = sc.next();
                    if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))
                    {
                        x = false;
                        boolean y = true;
                        while(y)
                        {
                            System.out.println("Enter your maximum budget (>10 Euros)"); //assuming the toy with the lowest price is 10 Euros
                            priceInput = sc.nextDouble();
                            if (priceInput < 10.0 || priceInput > 69.99) {
                                System.out.println("Entered budget must at least be 10 Euros or at max be 60 Euros!");

                            }else
                            y = false;
                        }
                    }
                else
                    System.out.println("Wrong input!");
                }
            }
            else
                System.out.println("Please enter a valid age (b/w 6 and 13 years old)");
            //return age,priceInput;
        }
    void Choice()
    {
        System.out.println(" Press 1 to Display all Toys.  Press 2 for Filling Details");
        ToyStore ts=new ToyStore();
        Customers cs=new Customers();

            Scanner sc= new Scanner(System.in);

           while(true) {
               int ch=sc.nextInt();
                if (ch == 1) {

                    ts.DisplayAllToys();
                    System.out.println(" \nPress 2 for Filling Details");

                }
                else if(ch ==2 )
                {
                    cs.input();
                    break;
                }
                else
                {
                    System.out.println("Enter Valid Choice");
                }
           }
        }
    public static void main(String[] args)
    {
            ToyPicker tp=new ToyPicker();
            Customers cs = new Customers();
            cs.Choice();
            tp.assistant();
    }
 }


