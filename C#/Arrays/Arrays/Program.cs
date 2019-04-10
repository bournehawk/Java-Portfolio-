using System;

namespace Arrays
{
    class MainClass
    {

        enum Days {Sat, Sun, Mon, Tues, Weds, Thurs, Fri };

        public static void Main(string[] args)
        {
            Console.Title = "Arrays";

            string[] cars = new string[3] {"BMW", "Ford","Opel"};

            int[,] coords = new int[2, 3] { { 1, 2, 3 }, { 4, 5, 6 } };

            Console.WriteLine("Second Car: " + cars[1]);

            Console.WriteLine("X1,Y1: " + coords[0, 0]);
            Console.WriteLine("X2,Y3: " + coords[1, 2]);
            Console.ReadKey();

            //------------------------------------------------------------------

            Console.Title = "Cast";

            double _num = 10.5;
            int _integer = 2;

            _num = _num + _integer;
            Console.WriteLine("Implicit Cast: " + _num);

            _num = (double)7 / _integer;
            Console.WriteLine("Explicit Cast: " + _num);

            char _letter = (char)65;
            Console.WriteLine("Cast Integer: " + _letter);

            int _ascii = (int)'A';
            Console.WriteLine("Cast Letter: " + _ascii);
            Console.ReadKey();


            //------------------------------------------------------------------

            Console.Title = "Constant";

            const double pi = 3.14159265358979;
            var daysType = typeof(Days);

            Console.WriteLine("Pi Type: " + pi.GetType());
            Console.WriteLine("Circumference: " + (pi * 3));


            Console.WriteLine("\nFirst Name: " + Days.Sat);
            Console.WriteLine("1st Index: " + (int)Days.Sat);

            string name = Enum.GetName(daysType, 1);
            Console.WriteLine("\n2nd Index: " + name);
            bool flag = Enum.IsDefined(daysType, "Mon");
            Console.WriteLine("Contains Mon?: " + flag);
            Console.ReadKey();


            //------------------------------------------------------------------

            Console.Title = "Arithmetic";

            int aa = 8;
            int bb = 4;

            Console.WriteLine("Addition:\t: " + aa + bb);
            Console.WriteLine("Subtraction:\t: " + (aa - bb));
            Console.WriteLine("Multiplication:\t: " + (aa * bb));
            Console.WriteLine("Division:\t: " + (aa / bb));
            Console.WriteLine("Modulus:\t: " + (aa % bb));

            Console.WriteLine("\nPostfix:\t: " + (aa++));
            Console.WriteLine("\nPrefix:\t: " + (++aa));
            Console.ReadKey();

            //------------------------------------------------------------------

            Console.Title = "Assign";

            int a;
            int b;

            Console.Write("Assign Values: ");
            Console.Write("\t a = " + (a = 8));
            Console.WriteLine("\t b = " + (b = 4));

            Console.Write("\n\nAdd and Assign: ");
            Console.Write("\t a += b (8 +=4)\t a = " + (a += b));

            Console.Write("\n\nSubtract and Assign: ");
            Console.Write("\t a -=  b (12 -= 4)\t a = " + (a -= b));

            Console.Write("\n\nMultiply and Assign: ");
            Console.Write("\t a *= b (8 *= 4)\t a = " + (a *= b));

            Console.Write("\n\nDivide and Assign: ");
            Console.Write("\t a /= b (32 /= 4)\t a = " + (a /= b));

            Console.Write("\n\nModulus and Assign");
            Console.Write("\t a %= b (8 %= 4)\t a = " + (a %= b));
            Console.ReadKey();











        }
    }
}
