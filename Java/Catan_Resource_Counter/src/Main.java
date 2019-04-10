/*  Name:   Sarah Hulcy
    Class:  MSITM 6340
    Date:   
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        Player_Information playerRecord = new Player_Information();
        Resource_Control playerResource = new Resource_Control();
        Dice_Rules dice_rules = new Dice_Rules();


        playerResource.player_information = playerRecord;
        playerResource.dice_rules = dice_rules;

        dice_rules.setDiceNumber();
        playerResource.setResourceName();

        System.out.println("                                  ");
        System.out.println("      Catan Resource Counter      ");
        System.out.println("      ----------------------      ");
        System.out.println("");

        playerRecord.playerSetup();



        //*****     Welcoming Statement    *****//
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.print("                          Welcome ");


        playerRecord.printPlayerNames();

        System.out.println("                          ---------------------------");
        System.out.println("");
        System.out.println("                      May The Odds Be Ever In Your Favor...");
        System.out.println("");
        System.out.println("                           OH WAIT.....Wrong Game....");
        System.out.println("");
        System.out.println("                                May The Road");
        System.out.println("                              rise to meet you");
        System.out.println("");
        System.out.println("                            May The Other Players");
        System.out.println("                            always be at your back");
        System.out.println("");
        System.out.println("                              May Brick and Wood");
        System.out.println("                          shine upon your resources");
        System.out.println("");
        System.out.println("                             And May The Robber");
        System.out.println("                   fall softly upon your opponents fields...");




        //*****     Explanation of Resource Tracker   *****//

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("   This app will allow you to track resources for each dice roll per player.");
        System.out.println("      Also, You will be able to modify the list as the game progresses.");
        System.out.println("The app will automatically print the resources per player after each modification.");


        System.out.println("");
        System.out.println("");
        System.out.println("");


        //*****     Player Resource Display   *****//

        playerResource.playerResourceStorage = new int [playerResource.player_information.playerNames.length] [10] [playerResource.resourceName.length];

        playerResource.resourceDisplay();

        playerResource.addResources();

        playerResource.resourceDisplay();

    }

}
