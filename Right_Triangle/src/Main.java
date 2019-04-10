/*  Name:   Sarah Hulcy
    Class:  MSITM 6340
    Date:   2/14/2018
 */

import java.util.Scanner;
import java.text.DecimalFormat;


public class Main {

    private static DecimalFormat df2 = new DecimalFormat(".##");

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


//Title
        System.out.println("                        ");
        System.out.println(" Right Triangle Checker");
        System.out.println("------------------------");
        System.out.println("                        ");


//User Prompt
        System.out.print("Enter the sides of a triangle:  ");


//Assignment
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        if ((side3 < side2) || (side3 < side1))
        {
            System.out.println("Invalid input. The third side must be larger than the first two sides.");
        }

        System.out.println("The three sides of the triangle are: " + side1 + " " + side2 + " " + side3);


//Finding the Largest and Smallest
       double lgSide1 = Math.max(side1,side2);
       double lgSide2 = Math.max(lgSide1, side3);

       double smSide1 = Math.min(side1, side2);
       double smSide2 = Math.min(smSide1, side3);

       double finalSide1 = smSide2;
       double finalSide2 = 0.0;
       double finalSide3 = lgSide2;


//Finding the number that is not the largest or the smallest
       if ((side1 != lgSide2) && (side1 != smSide2))
       {
           finalSide2 = side1;
       }
       else if ((side2 != lgSide2) && (side2 != smSide2))
       {
           finalSide2 = side2;
       }
       else if ((side3 != lgSide2) && (side3 != smSide2))
       {
           finalSide2 = side3;
       }

        System.out.println("The sides from smallest to largest are " + finalSide1 + " " + finalSide2 + " " + finalSide3);


//Calculate the powers
        double side1Calc = (Math.pow(finalSide1, 2));
        double side2Calc = (Math.pow(finalSide2, 2));
        double side3Calc = (Math.pow(finalSide3, 2));

        System.out.println("The side calculations are: " + side1Calc + " " + side2Calc + " " + side3Calc);


//Print if Right Triangle or Not
        if ((side1Calc + side2Calc) == side3Calc)
        {
            System.out.print("You have entered a right triangle.");
        }
        else
            System.out.print("The triangle you entered is not a right triangle.");
    }

}
