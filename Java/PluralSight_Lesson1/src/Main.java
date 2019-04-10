/*  Name:   Sarah Hulcy
    Class:  MSITM 6340
    Date:   
 */


public class Main {

    public static void main(String[] args) {
        double val1 = 100, val2 = 0, result;
        char opCode = 'd';

        if(opCode == 'a')
        {
            result =  val1 + val2;
        }
        else if(opCode == 's')
        {
            result = val1 - val2;
        }
        else if(opCode == 'd')
        {
            result = val2 != 0.0d ? val1 / val2 : 0.0d;
        }
        else if(opCode == 'm')
        {
            result = val1 * val2;
        }
        else
        {
            System.out.println("Error - Invalid opcode");
            result = 0.0d;
        }

        System.out.println(result);

        int kVal = 5;
        int factorial = 1;

        while(kVal > 1)
        {
           // factorial *= kVal;
            // kVal -= 1;
            factorial *= kVal--;
        }

        System.out.println(factorial);

        int gVal = 5;

        do
        {
            factorial *= kVal--;
            System.out.println(" * 2 = ");
            gVal *= 2;
            System.out.println(gVal);
        }
        while(kVal > 1);

        for(int iVal = 1; iVal < 100; iVal *= 2)
            System.out.println(iVal);

        float[] theVals =  new float[3];

        theVals[0] = 10.0f;
        theVals[1] = 20.0f;
        theVals[3] = 15.0f;

        float sum = 0.0f;

        for(int i = 0; i < theVals.length; i++)
            sum += theVals[i];

        System.out.println(sum);

        float[]theVals2 = { 10.0f,20.0f,15.0f };

        for(float currentVal : theVals)
            sum += currentVal;




    }

}

