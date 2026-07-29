package lesson20_while_loops;

import java.util.Scanner;

public class GuessTheNumber{
    public static void main(String[] args){

        //GUESS THE NUMBER

        //WHILE

        Scanner scanner = new Scanner(System.in);

        int secretNum = 7;
        int guessedNum;

        System.out.println("Let's play a number guessing game!");
        System.out.print("Guess the number: ");
        guessedNum = scanner.nextInt();

        while(guessedNum != secretNum){
            System.out.println("Wrong Guess! Try again.");
            System.out.print("Guess the number: ");
            guessedNum = scanner.nextInt();
        }

        System.out.println("CORRECT!");

        scanner.close();
    }
}
