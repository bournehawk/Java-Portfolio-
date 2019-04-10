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

        double radius = input.nextDouble();

        System.out.print("");

        Circle circle1 = new Circle();
        circle1.radius = radius;

        System.out.println("The area is: " + circle1.getArea());

        Circle circle2 = new Circle(3.0);

        System.out.println("The area is: " + circle2.getArea());


    }

}
