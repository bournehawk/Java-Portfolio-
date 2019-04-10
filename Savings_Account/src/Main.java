/*  Name:   Sarah Hulcy
    Class:  MSITM 6340
    Date:   4/9/2018
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your account balance? ");

        double initialAmount =input.nextDouble();

        System.out.println("Wwhat is your Annual Percentage Yield? ");

        double inputAPY = input.nextDouble();

        AccountHolder newAccountHolder = new AccountHolder("Sarah", "Hulcy", "123 Main St", "6825976583", "999-99-9999", "test_User@gmail.com");

        SavingsAccount newSavingsAccount = new SavingsAccount(initialAmount, inputAPY,newAccountHolder);

        newSavingsAccount.displayAccountInfo();

        System.out.println("Fast forward time in months: ");

        newSavingsAccount.moveForwardInTime(input.nextInt());

        newSavingsAccount.displayAccountInfo();

    }

}
