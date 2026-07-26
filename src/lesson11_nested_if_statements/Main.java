package lesson11_nested_if_statements;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        //LOG IN CHECKER

        Scanner scanner = new Scanner(System.in);

        String correctEmail = "abc01@gmail.com";
        String correctPassword = "pass@123";
        String enteredEmail;
        String enteredPassword;

        System.out.println("Enter your email: ");
        enteredEmail = scanner.nextLine();

        System.out.println("Enter your password: ");
        enteredPassword = scanner.nextLine();

        if(correctEmail.equals(enteredEmail)){
            if(correctPassword.equals(enteredPassword)){
                System.out.println("LOGGED IN SUCCESSFULLY");
            }
            else{
                System.out.println("INVALID PASSWORD!!!");
            }
        } else if(correctPassword.equals(enteredPassword)){
            System.out.println("INVALID EMAIL!");
        }
        else{
            System.out.println("INVALID EMAIL & PASSWORD!!");
        }
        scanner.close();
    }
}
