public class Dice_Rules
{
    int [] diceNumber;
    int [] currentDiceStorage ;
    int [] currentAmountStorage ;
    String [] currentResourceStorage ;

    Resource_Control resource_control;

//***** Sets Dice Number Method *****//
    public void setDiceNumber()
    {
        diceNumber = new int[10];
        diceNumber[0] = 2;
        diceNumber[1] = 3;
        diceNumber[2] = 4;
        diceNumber[3] = 5;
        diceNumber[4] = 6;
        diceNumber[5] = 8;
        diceNumber[6] = 9;
        diceNumber[7] = 10;
        diceNumber[8] = 11;
        diceNumber[9] = 12;
    }

//***** Currently Unused *****//
    public void diceResource()
    {
        for (int diceIndex = 0; diceIndex <= diceNumber[diceIndex]; diceIndex++)
        {
            if(resource_control.currentDice == diceNumber[diceIndex])
            {
                System.out.print(diceNumber[diceIndex]);
                System.out.println(" - ");
            }
        }
    }

//***** Currently Unused *****//
    public void setCurrentDiceStorage()
    {
        for (int diceIndex = 0; diceIndex <= diceNumber[diceIndex]; diceIndex++)
        {
            if(resource_control.currentDice == diceNumber[diceIndex])
            {
                System.out.print(diceNumber[diceIndex]);
                System.out.println(" - ");
                System.out.print(currentResourceStorage + " " + currentAmountStorage);
            }
        }
    }
}

