/*  Name:   Sarah Hulcy
    Class:  MSITM 6340
    Date:   2/7/2018
 */
import java.util.Scanner;
import java.text.DecimalFormat;



public class Body_Mass_Index {

    private static DecimalFormat df2 = new DecimalFormat(".##");

    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to enter your measurements in feet and pounds, type 0.");
        System.out.println( "If you would like to enter your measurements in meters and kilograms, type 1: ");

        byte measurementChoice = input.nextByte();

        double weightConver = 0.00;
        double heightConver = 0.00;


        if (measurementChoice == 0)
        {
            System.out.print("Enter your weight in pounds: ");

            weightConver = input.nextDouble()*0.45359237;

            System.out.println("Weight in Pounds: " + df2.format(weightConver));



            System.out.print("Enter Feet: ");
            int feetConver = input.nextInt() * 12;
            System.out.println("Height in Feet: " + df2.format( feetConver));
            System.out.print("Enter inches: ");





            heightConver = (feetConver + input.nextDouble()) * 0.0254;

            System.out.println("Height in Feet plus Inches: " + df2.format(heightConver/0.0254));


        }
        else if (measurementChoice == 1)
        {
            System.out.print("Enter weight in kilograms: ");

            weightConver = input.nextDouble();

            System.out.println("Weight in Kilograms: " + df2.format( weightConver));



            System.out.print("Enter meters: ");

            heightConver = input.nextDouble();

            System.out.println("Height in Meters: " + df2.format(heightConver));


        }


        double bMICalc = weightConver/(heightConver*heightConver);


        String interpretation = "";

        if (bMICalc < 18.5)
        {
            interpretation = "Underweight";
        }
        else if (bMICalc < 25.0)
        {
            interpretation = "Normal";
        }
        else if (bMICalc < 30.0)
        {
            interpretation = "Overweight";
        }
        else if (bMICalc >= 30.0)
        {
            interpretation = "Obese";
        }
        else
        {
            interpretation = "CALC_ERROR";
        }

        System.out.print("Your BMI is " + df2.format(bMICalc) + " which makes your interpretation " + interpretation);



    }

}
