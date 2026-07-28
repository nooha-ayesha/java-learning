package lesson15_ternary_operator;

import java.util.Scanner;
public class PassFailChecker{
    public static void main(String[] args){

        //TERNARY OPERATOR ?(variable = (condition) ? "ifTrue" : "ifFalse")

        //PASS OR FAIL CHECKER

        Scanner scanner = new Scanner(System.in);

        int marks;
        System.out.println("PASS OR FAIL CHECKER");
        System.out.print("Enter your marks: ");
        marks = scanner.nextInt();

        String passOrfail = (marks >= 40) ? "RESULT: PASS!" : "RESULT: FAIL!";

        System.out.println(passOrfail);

        scanner.close();
    }
}
