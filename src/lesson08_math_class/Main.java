package lesson08_math_class;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //MATH CLASS

        /*
        System.out.println(Math.max(2,3));
        System.out.println(Math.abs(-3));
        System.out.println(Math.min(3,2));
        System.out.println(Math.pow(8,2));
        System.out.println(Math.round(2.3));
        System.out.println(Math.ceil(2.5));
        System.out.println(Math.floor(2.99));
        System.out.println(Math.E);
        System.out.println(Math.PI);
       */

        //HYPOTENUSE c = Math.sqrt(a² + b²)

        /*
        double a;
        double b;
        double c;

        System.out.print("Enter the value of A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the value of B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.print("The hypotenuse (c) is: " + c);

        */


        //FINDING THE CIRCUMFERENCE, AREA, & VOLUME

        /*
        circumference = 2 * Math.PI * radius
        area = Math.PI * Math.pow(radius, 2)
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3)
         */

        /*
        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        System.out.print("The circumference is: " + circumference);

        area = Math.PI * Math.pow(radius, 2);
        System.out.print("\nThe area is: " + area);

        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
        System.out.print("\nThe volume is: " + volume);


         */
        scanner.close();

    }
}
