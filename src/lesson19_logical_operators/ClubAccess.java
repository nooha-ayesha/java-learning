package lesson19_logical_operators;

import java.util.Scanner;

public class ClubAccess{
    public static void main(String[] args){

        //LOGICAL OPERATORS

        /*
         && - AND
         || - OR
         ! - NOT
         */

        //CLUB ACCESS CHECKER

        Scanner scanner = new Scanner(System.in);

        int age;
        boolean hasId;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Do you have an ID? (true/false): ");
        hasId = scanner.nextBoolean();

        if(age >=18 && hasId){
            System.out.println("ACCESS GRANTED!");
        }
        else{
            System.out.println("ACCESS DENIED!");
        }

        scanner.close();
    }
}
