package lesson13_substring;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        //SUBSTRING

        Scanner scanner = new Scanner(System.in);

        String email;
        String domain;
        String username;

        System.out.println("Enter your email: ");
        email = scanner.nextLine();

        /*
        username = email.substring(0, email.indexOf("@"));
        System.out.print("username: " + username);

        domain = email.substring(email.indexOf("@") + 1);
        System.out.println("\nDomain: " + domain);

         */

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            System.out.print("username: " + username);

            domain = email.substring(email.indexOf("@") + 1);
            System.out.println("\nDomain: " + domain);
        }
        else{
            System.out.println("Email must contain @!!");
        }



        scanner.close();

    }
}
