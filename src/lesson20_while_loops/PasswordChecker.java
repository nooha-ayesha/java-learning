package lesson20_while_loops;

import java.util.Scanner;

public class PasswordChecker{
    public static void main(String[] args){

        //WHILE LOOPS

        //WHILE

        //PASSWORD CHECKER

        Scanner scanner = new Scanner(System.in);

        String password = "";

        System.out.print("Enter the password:");
        password = scanner.nextLine();

        while(!password.equals("pass@12")){
            System.out.println("Incorrect! Try again.");
            System.out.print("Enter the password: ");
            password = scanner.nextLine();
        }

        System.out.println("ACCESS GRANTED!");

        scanner.close();

    }
}
