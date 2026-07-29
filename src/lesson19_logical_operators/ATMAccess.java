package lesson19_logical_operators;

import java.util.Scanner;

public class ATMAccess{
    public static void main(String[] args){

        //ATM ACCESS

        Scanner scanner = new Scanner(System.in);

        boolean cardInserted;
        boolean correctPIN;
        boolean accBlocked;

        System.out.print("Is the card inserted? (true/false): ");
        cardInserted = scanner.nextBoolean();

        System.out.print("Is the PIN correct? (true/false): ");
        correctPIN = scanner.nextBoolean();

        System.out.print("Is your account blocked? (true/false): ");
        accBlocked = scanner.nextBoolean();

        if(cardInserted && correctPIN && !accBlocked){
            System.out.println("ACCESS GRANTED");
        }
        else{
            System.out.println("TRANSACTION CANCELLED!");
        }

        scanner.close();
    }
}
