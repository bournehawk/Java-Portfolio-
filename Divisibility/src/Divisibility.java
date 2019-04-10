import java.util.Scanner;

public class Divisibility {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int numberEntered = input.nextInt();

        System.out.println("Is " + numberEntered + "divisible by 5 and 6? " + (numberEntered % 5 ==0 && numberEntered % 6 ==0));
        System.out.println("Is " + numberEntered + "divisible by 5 or 6? " + (numberEntered % 5 ==0 || numberEntered % 6 ==0));
        System.out.println("Is " + numberEntered + "divisible by 5 or 6, but not both? " + (numberEntered % 5 ==0 ^ numberEntered % 6 ==0));

    }
}

