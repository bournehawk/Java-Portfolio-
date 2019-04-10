import java.util.Scanner;
import java.text.DecimalFormat;

public class SC_Main {

    private static DecimalFormat df2 = new DecimalFormat(".##");

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        //Get salary values
        System.out.print("What is your yearly salary?");

            double salary = keyboard.nextDouble();

        //Get paycheck number
        System.out.print("How many times per month do you receive a paycheck?");

            double paychk_num = keyboard.nextDouble();

        //Get check deduction amounts
        System.out.print("How much is deducted from each paycheck?");

            double ded_amt = keyboard.nextDouble();


            double   pp_amt = (salary / (paychk_num * 12)) - ded_amt;

        System.out.println("That is a good salary, that means you make " + df2.format(pp_amt) + " per paycheck, I wish I made that much.");

    }

}

