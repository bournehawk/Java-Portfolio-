/*  Name:   Sarah Hulcy
    Class:  MSITM 6340
    Date:   
 */

import java.util.Scanner;

public class SavingsAccount
{
    private double apy;
    private double accountBalance;
    private AccountHolder AccountHolder;

    public SavingsAccount (double initialAmount, double apy, AccountHolder AccountHolder)
    {
        accountBalance = initialAmount;
        this.apy = apy;
        this.AccountHolder = AccountHolder;
    }

    public double getAccountBalance ()
    {
        return accountBalance;
    }

    public void changeAPY (double newAPY)
    {
        apy = newAPY;
    }

    public void moveForwardInTime (int monthsToMoveForward)
    {
        for( int i = 0; i < monthsToMoveForward;i++)
        {
            int months = monthsToMoveForward;

                double x = (apy/100) /12;
                accountBalance = (accountBalance * x) + accountBalance;
        }

    }

    public void displayAccountInfo ()
    {
        System.out.println(AccountHolder.getFullName());
        System.out.println(AccountHolder.getAddress());
        System.out.println(AccountHolder.getPhoneNumber());
        System.out.println(AccountHolder.getSSN());
        System.out.println(AccountHolder.getEmail());
        System.out.println(getAccountBalance());


    }
}
