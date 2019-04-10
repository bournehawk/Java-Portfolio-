/*  Name:   Sarah Hulcy
    Class:  MSITM 6340
    Date:   
 */

// import javax.swing.*;
// import java.util.Scanner;
import java.text.DecimalFormat;


public class Pick_A_Card{

    private static DecimalFormat df2 = new DecimalFormat(".#");

    public static void main(String[] args) {

        final int DECK_OF_CARDS = 52;

        double randomNumber =  Math.random();

        int cardNumber = (int)(DECK_OF_CARDS * randomNumber);

        String cardSuit = "";


        System.out.print("The card you picked is ");


        if (cardNumber % 13 == 0)

            System.out.print("Ace of ");

        else if (cardNumber % 13 == 10)

            System.out.print("Jack of ");

        else if (cardNumber % 13 == 11)

            System.out.print("Queen of ");

        else if (cardNumber % 13 == 12)

            System.out.print("King of ");

        else

            System.out.print(((cardNumber % 13) + 1) + " of ");


        if (cardNumber / 13 == 0)
        {
            System.out.print("Clubs");
        }

        else if (cardNumber / 13 == 1)
        {
            System.out.print("Diamonds");
        }

        else if (cardNumber / 13 == 2)
        {
            System.out.print("Hearts");
        }

        else if (cardNumber / 13 == 3)
        {
            System.out.print("Spades");
        }

    }

}
