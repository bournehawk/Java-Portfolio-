/*  Name:   Sarah Hulcy
    Class:  MSITM 6340
    Date:   
 */

import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {

    private static DecimalFormat df2 = new DecimalFormat(".##");

    public static void main(String[] args) {

        System.out.print("Enter weight and price for package 1: ");

        Scanner input = new Scanner(System.in);

        double p1Weight = input.nextDouble();

        double p1Price = input.nextDouble();

        System.out.print("Enter weight and price for package 2: ");

        double p2Weight = input.nextDouble();

        double p2Price = input.nextDouble();

        double p1PPOZ = p1Price/p1Weight;

        double p2PPOZ = p2Price/p2Weight;

        if (p1PPOZ < p2PPOZ)
        {
            System.out.print("Package 1 has the better price of ");

            if (p1PPOZ< 1)
            {
                System.out.print(df2.format(p1PPOZ) + " cents per pound");
            }
            else
                System.out.print(df2.format(p1PPOZ) + " dollars per pound");

        }


        else if (p1PPOZ > p2PPOZ)
        {
            System.out.print("Package 1 has the better price of ");

            if (p2PPOZ< 1)
            {
                System.out.print(df2.format(p2PPOZ) + " cents per pound");
            }
            else
                System.out.print(df2.format(p2PPOZ) + " dollars per pound");
        }


        else if (p1PPOZ == p2PPOZ)
        {
            System.out.print("Package 1 and 2 are the same price of ");

            if (p2PPOZ< 1)
            {
                System.out.print(df2.format(p2PPOZ) + " cents per pound");
            }
            else
                System.out.print(df2.format(p2PPOZ) + " dollars per pound");
        }


        else
            System.out.print("Check your numbers and try again");




    }

}
