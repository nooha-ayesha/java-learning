package lesson10_compound_interest_calculator;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        //COMPOUND INTEREST CALCULATOR

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principle amount: ");
        principal = scanner.nextDouble();

        System.out.print("\nEnter the interest rate in %: ");
        rate = scanner.nextDouble() / 100;

        System.out.print("\nEnter the no of times compounded: ");
        timesCompounded = scanner.nextInt();

        System.out.print("\nEnter the no of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        //System.out.println("The total amount after " + years + " is: " + amount);
        System.out.printf("The total amount after %d is: $%.2f", years, amount);

        scanner.close();
    }
}
