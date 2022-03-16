package ToyStore;
 class ToyStore {
     final String[] BrdToys =new String[]{"Chess"," Ludo"," Chinese Checkers"," Monopoly"," Pictionary" };  //String
     final int[] BrdToysPrice= new int[]{ 15,12,20,25,30}; //price in euros
     final String[] SoftToys = new String[]{"Stuffed Animals","Plush Pillows","Teddy Bear","Octopus","Unicorn"};
     final int[] STPrice=new int[] {20,26,25,20,26};
    final String[] AfigureF = new String[]{"Barbie","Black Widow","Wonder Woman","Valkyrie","Catwoman"};
     final int[] AfigFPrice= new int[]{20,25,20,26,30,25};
     final String [] AfigureB=new String[]{"Iron Man","Spider Man","Hulk ","Thor"," AquaMan"};
    final int[] AfigBPrice= new int[]{20,25,20,26,30,25};
     final String[] CarToys= new String[]{"Monster Truck","HotWheels","RC Cars\t","Trucks","RoboCar"};
     final int[] CarToyP= new int[]{20,35,20,26,30,25};

     public void DisplayAllToys()
     {
         System.out.println("<---Board Games---> " );
         for (int i = 0; i <5 ; i++) {
             System.out.print(BrdToys[i]);
         }
         System.out.println("");
         System.out.println("<---Soft Toys---> " );
         for (int i = 0; i <5 ; i++) {
             System.out.print(SoftToys[i]+" ");
         }
         System.out.println("");
         System.out.println("<---Action Figures---> " );
         for (int i = 0; i <5 ; i++) {
             System.out.print(AfigureB[i]+" \t"+AfigureF[i]+" ");
         }
         System.out.println("");
         System.out.println("<---Toy Cars---> " );
         for (int i = 0; i <5 ; i++) {
             System.out.print(CarToys[i]+" ");
         }
     }


}