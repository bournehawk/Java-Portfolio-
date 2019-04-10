/*  Name:   Sarah Hulcy
    Class:  MSITM 6340
    Date:   
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
            //1-800-flowers
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a phone number: ");

        String theNumberReceived = input.next();

        for(int i = 0; i < theNumberReceived.length(); i++)
        {
            char x = theNumberReceived.charAt(i);

            if (x == '-')
            {
                System.out.print(x);
            }

            else if (Character.isDigit(x) == false)
            {
                if (Character.isLowerCase(x) == false)
                {
                    x = Character.toLowerCase(x);
                }

                int numberFromGetNumberMethod= getNumber(x);
                System.out.print(numberFromGetNumberMethod);
            }

            else System.out.print(x);
        }

    }

    public static int getNumber(char uppercaseLetter)
    {
        int num;
        if ((uppercaseLetter == 'a') || (uppercaseLetter == 'b') || (uppercaseLetter == 'c'))
            num = 2;

        else if ((uppercaseLetter == 'd') || (uppercaseLetter == 'e') || (uppercaseLetter == 'f'))
            num = 3;

        else if ((uppercaseLetter == 'g') || (uppercaseLetter == 'h') || (uppercaseLetter =='i'))
            num = 4;

        else if ((uppercaseLetter == 'j') || (uppercaseLetter == 'k') || (uppercaseLetter == 'l'))
            num = 5;

        else if ((uppercaseLetter == 'm') || (uppercaseLetter == 'n') || (uppercaseLetter == 'o'))
            num = 6;

        else if ((uppercaseLetter == 'p') || (uppercaseLetter =='q') || (uppercaseLetter == 'r') || (uppercaseLetter == 's'))
            num = 7;

        else if ((uppercaseLetter == 't') || (uppercaseLetter == 'u') || (uppercaseLetter == 'v'))
            num = 8;

        else if ((uppercaseLetter == 'w') || (uppercaseLetter == 'x') || (uppercaseLetter == 'y') || (uppercaseLetter == 'z'))
            num = 9;

        else
            return 0;

        return num;
    }


}
