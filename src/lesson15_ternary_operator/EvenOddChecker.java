package lesson15_ternary_operator;

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args){

            //TERNARY OPERATOR ?(variable = (condition) ? "ifTrue" : "ifFalse")

            //EVEN OR ODD CHECKER

            Scanner scanner = new Scanner(System.in);

            int number;


            System.out.println("EVEN or ODD CHECKER");
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            String evenOrodd = (number % 2 == 0) ? "You have entered an EVEN number" : "You have entered an ODD number";

            System.out.println(evenOrodd);

            scanner.close();

    }
}
