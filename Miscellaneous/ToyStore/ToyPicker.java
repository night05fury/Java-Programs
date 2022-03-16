package ToyStore;

import java.util.Scanner;

public class ToyPicker extends ToyStore {
    ToyStore ts = new ToyStore();
    Scanner sc = new Scanner(System.in);
    int cat;

    void assistant() {

        boolean x = true;
        while (x) {
            System.out.println("""
                Enter the type of Toy you want:\s
                 1 >> Board Toys\t(age 8+)
                 2 >> Soft Toys\t(age 3+ (F))
                 3 >> Action Figures\t(age 5+)
                 4 >> Toy Cars\t(age 3+ (M))
                 5 >> Exit Menu Press 5""");
            cat = sc.nextInt();  //for choosing the Toy Category
            switch (cat) {
                case (1) -> {
                    if (Customers.age >= 8) {
                        System.out.println("The toys suggested is 'MonoPoly' \n" +
                                "To show more suggestions press 9");         /*System.out.println("Your Child is underage for this Toy ,
                                You can browse other Toys")*/
                        ShowMore(ts.BrdToys, ts.BrdToysPrice);

                    } else
                        System.out.println("You are under age for this category of toy");
                }
                case (2) -> {
                    if (Customers.age >= 3)
                        if (Customers.gender.equals("female")) {
                            System.out.println("The toys suggested is 'Teddy Bear','Unicorn'\n To show more suggestions press 9");
                            ShowMore(ts.SoftToys, ts.STPrice);
                        } else
                            System.out.println("No Other Toys Available");
                }
                case (3) -> {
                    if (Customers.age >= 5) if (Customers.gender.equals("female")) {
                        System.out.println("The toys suggested is 'Barbie'\t\n To show more suggestions press 9");
                        ShowMore(ts.AfigureF, ts.AfigFPrice);
                    } else {
                        System.out.println("The toys suggested is 'Hulk'\t\n To show more suggestions press 9");
                        ShowMore(ts.AfigureB, ts.AfigBPrice);
                    }
                    else {
                        System.out.println("No toys available for this age");
                    }
                }
                case (4) -> {
                    if (Customers.age >= 3) {
                        System.out.println("The toys suggested is 'Monster Truck'\t\n To show more suggestions press 9");
                        ShowMore(ts.CarToys, ts.CarToyP);
                    }
                }
                case (5) -> x = false;
                default -> System.out.println("Enter valid choice only");
            }

        }
    }
    void ShowMore(String[] show, int[] showPrice)  //to show more Toys Options
    {
        int sM = sc.nextInt();
        if (sM == 9) {
            new Checkout(show, showPrice);
        } else {
            System.out.println("Unexpected Input:" + sM);
        }
    }
}