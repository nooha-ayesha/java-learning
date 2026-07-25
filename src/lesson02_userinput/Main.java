package lesson02_userinput;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        //sample user input

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your cgpa: ");
        double cgpa = scanner.nextDouble();

        System.out.println("Hello, " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your CGPA is: " + cgpa);

        scanner.close();
    }

}
