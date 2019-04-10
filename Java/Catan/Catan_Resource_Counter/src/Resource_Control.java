import java.util.Scanner;


public class Resource_Control
{
    Scanner input = new Scanner(System.in);

    String currentResource;
    int currentAmount;
    int currentDice = 0;


    Player_Information player_information;
    String[] resourceName;
    Dice_Rules dice_rules;

    int [] [] [] playerResourceStorage;



//***** Generate Resource Names *****//
    public void setResourceName()
    {
        resourceName = new String[5];
        resourceName[0] = "Brick";
        resourceName[1] = "Wood";
        resourceName[2] = "Sheep";
        resourceName[3] = "Wheat";
        resourceName[4] = "Ore";
    }

//***** Display Resources to Console *****//
    public void resourceDisplay()
    {
        for (int playerIndex = 0; playerIndex < player_information.playerNames.length; playerIndex++)
        {
            System.out.println("");
            System.out.println("");
            System.out.println(player_information.playerNames[playerIndex]);

                for (int diceIndex = 0; diceIndex < dice_rules.diceNumber.length; diceIndex++)
                {
                    System.out.print(dice_rules.diceNumber[diceIndex]);
                    System.out.print(" - ");

                    for (int resourceIndex = 0; resourceIndex < resourceName.length; resourceIndex++)
                    {
                        if (playerResourceStorage [playerIndex] [diceIndex] [resourceIndex] > 0)
                        {
                            System.out.print(" " + resourceName[resourceIndex] + " " + playerResourceStorage[playerIndex][diceIndex][resourceIndex] + "   ");
                        }
                    }

                    System.out.println(" ");
                }
        }
    }

//***** Add Resources Method *****//
    public void addResources()
    {
        for (int playerIndex = 0; playerIndex < player_information.playerNames.length; playerIndex++)
        {
            System.out.println("");
            System.out.println("");

            while(true)
            {
                System.out.println("Does " + player_information.playerNames[playerIndex] + " have any resources to add?");
                System.out.println("Please enter Yes or No.");
                String moreResources = input.next().toLowerCase();

                if (moreResources.equals("yes") == false)
                {
                    break;
                }

                System.out.println("What resource does " + player_information.playerNames[playerIndex] + " have? ");

                currentResource = input.next().toLowerCase();

                System.out.println("What dice is that resource on? ");

                currentDice = input.nextInt();

                System.out.println("How much " + currentResource + " does " + player_information.playerNames[playerIndex] + " have on " + currentDice);

                currentAmount = input.nextInt();
                boolean validResource = false;
                int resourceIndexStorage = -1;

                for (int resourceIndex = 0; resourceIndex < resourceName.length; resourceIndex++)
                {
                    if (resourceName[resourceIndex].toLowerCase().equals(currentResource))
                    {
                        validResource = true;
                        resourceIndexStorage = resourceIndex;
                        break;
                    }
                    else
                    {
                        validResource = false;
                    }
                }

                if (currentDice != 0 && validResource == true)
                {
                    for (int diceIndex = 0; diceIndex < dice_rules.diceNumber.length; diceIndex++)
                    {
                        if (currentDice == dice_rules.diceNumber[diceIndex])
                        {
                            playerResourceStorage[playerIndex][diceIndex][resourceIndexStorage] += currentAmount;

                        }
                    }
                }
            }
        }
    }
}


