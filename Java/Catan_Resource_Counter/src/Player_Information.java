import java.util.Scanner;





public class Player_Information
{
    String [] playerNames;


    public void playerSetup()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("How many players will be playing today? ");
        int numberOfPlayers = input.nextInt();

        playerNames  = new String[numberOfPlayers];

        System.out.println("");
        System.out.println("What are the names of the " + numberOfPlayers + " players today?");

        for (int playerIndex = 0; playerIndex < numberOfPlayers; playerIndex++)
        {
            playerNames[playerIndex] = input.next();
        }
    }

//***** Print Player Names Method *****//
    public void printPlayerNames()
    {
        for (int playerIndex = 0; playerIndex < playerNames.length; playerIndex++)
        {
            if (playerIndex == playerNames.length-1)
            {
                System.out.print("and ");
                System.out.println(playerNames[playerIndex]);
            }
            else
            {
                System.out.print(playerNames[playerIndex]);
                System.out.print(", ");
            }
        }
    }
}