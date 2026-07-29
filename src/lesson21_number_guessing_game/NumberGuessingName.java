package lesson21_number_guessing_game;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingName{
    public static void main(String[] args){

        //NUMBER GUESSING GAME

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max);

        System.out.println("NUMBER GUESSING GAME");
        System.out.printf("Guess a number between %d - %d!", min, max);

        do{
            System.out.print("\nGuess the number: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("TOO LOW! Try again.");
            }
            else if(guess > randomNumber){
                System.out.println("TOO HIGH! Try again.");
            }
            else{
                System.out.print("CORRECT! The number was: " + randomNumber);
                System.out.print("\nNumber of attempts: " + attempts);
            }

        }while(guess != randomNumber);

       scanner.close();
    }
}
