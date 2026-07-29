package lesson19_logical_operators;

import java.util.Scanner;

public class VIPClubAccess{
    public static void main(String[] args){

        //VIP CLUB ACCESS

        Scanner scanner = new Scanner(System.in);

        int age;
        boolean isVIP;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a VIP? (true/false): ");
        isVIP = scanner.nextBoolean();

        if(age >= 18 || isVIP){
            System.out.println("WELCOME TO THE CLUB!");
        }
        else{
            System.out.println("Sorry, you cannot enter!");
        }

        scanner.close();

    }
}
