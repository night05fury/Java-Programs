// Switch / Case implementing with swing

import javax.swing.*;

public class Twelve {

   // method main begins execution of Java application
   public static void main( String args[] ) {
      JTextArea outputArea = new JTextArea( 17, 40 );
      JScrollPane scroller = new JScrollPane( outputArea );
      String result = "";

      for ( int day = 1; day <= 12; day++ ) {
         result += "\nOn the ";

         // add correct day to String
         switch( day ) {

            case 1:
               result += "first";
               break;

            case 2:
               result += "second";
               break;

            case 3:
               result += "third";
               break;

            case 4:
               result += "fourth";
               break;

            case 5:
               result += "fifth";
               break;

            case 6:
               result += "sixth";
               break;

            case 7:
               result += "seventh";
               break;

            case 8:
               result += "eighth";
               break;

            case 9:
               result += "ninth";
               break;

            case 10:
               result += "tenth";
               break;

            case 11:
               result += "eleventh";
               break;

            case 12:
               result += "twelfth";
               break;

         }  // end switch

         result += " day of Christmas, my true love gave to me:\n";

         // add remainder of verse to String
         switch( day ) {

            case 12:
               result += " Twelve lords-a-leaping,\n";

            case 11:
               result += " Eleven pipers piping,\n";

            case 10:
               result += " Ten drummers drumming,\n";

            case 9:
               result += " Nine ladies dancing,\n";

            case 8:
               result += " Eight maids-a-milking,\n";

            case 7:
               result += " Seven swans-a-swimming,\n";

            case 6:
               result += " Six geese-a-laying,\n";

            case 5:
               result += " Five golden rings.\n";

            case 4:
               result += " Four calling birds,\n";

            case 3:
               result += " Three French hens,\n";

            case 2:
               result += " Two turtle doves, and \n";

            case 1:
               result += " a Partridge in pear tree.\n";

         }  // end switch

      }  // end for

      outputArea.setText( result );
      JOptionPane.showMessageDialog(
         null, scroller, "Twelve Days of Christmas",
         JOptionPane.INFORMATION_MESSAGE );

      System.exit( 0 );

   }  // end method main

}  // end class Twelve
