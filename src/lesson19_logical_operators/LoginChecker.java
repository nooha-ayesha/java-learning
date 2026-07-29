package lesson19_logical_operators;

import java.util.Scanner;

public class LoginChecker{
    public static void main(String[] args){

        //LOGIN CHECKER

        Scanner scanner = new Scanner(System.in);

        String username = "admin";
        String enteredUsername;
        String password = "java@123";
        String enteredPassword;

        System.out.print("Enter the username: ");
        enteredUsername = scanner.nextLine();

        System.out.print("Enter the password: ");
        enteredPassword = scanner.nextLine();

        if(username.equals(enteredUsername) && password.equals(enteredPassword)){
            System.out.println("LOGIN SUCCESSFUL!");
        }
        else{
            System.out.println("INVALID USERNAME OR PASSWORD!");
        }

        scanner.close();

    }
}
