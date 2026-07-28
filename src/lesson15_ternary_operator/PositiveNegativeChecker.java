package lesson15_ternary_operator;

import java.util.Scanner;
public class PositiveNegativeChecker {
    public static void main(String[] args){

        //TERNARY OPERATOR ?(variable = (condition) ? "ifTrue" : "ifFalse")

        //POSITIVE OR NEGATIVE CHECKER

        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.println("POSITIVE OR NEGATIVE CHECKER");
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        String positiveOrnegative = (number > 0) ? "You have entered a POSITIVE number" : "You have entered a NEGATIVE number";

        System.out.println(positiveOrnegative);

        scanner.close();
    }
}

