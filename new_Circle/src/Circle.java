public class Circle
{
    double radius;

    Circle()
    {
        System.out.println("Creating empty circle");
    }

    Circle(double newRadius)
    {
        radius = newRadius;
        System.out.println("Creating circle with radius: " + newRadius);
    }

    double getArea()
    {
        return Math.PI * radius * radius;
    }
}
