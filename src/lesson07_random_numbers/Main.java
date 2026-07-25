package lesson07_random_numbers;

import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        //RANDOM NUMBERS

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        //HEADS OR TAILS GAME

       /*
        System.out.println("HEADS OR TAILS!!!!");
        System.out.println("CHOOSE ONE");
        System.out.println("You are playing against a COMPUTER!");
        System.out.println("\n===========================================================================");
        System.out.println("RULES:");
        System.out.println("1.choose heads or tails");
        System.out.println("2.if the choice is whatever you have chosen>>>>YOU WIN!!!!🥳");
        System.out.println("=============================================================================");

        Boolean isHeads = random.nextBoolean();

        if (isHeads) {
            System.out.println("coin flipped: HEADS");
        }
        else{
            System.out.println("coin flipped: TAILS");

        }

        Boolean isChoice;

        System.out.println("\n\nWAS IT WHAT YOU CHOSE?!!!!!! (true/false): ");
        isChoice = scanner.nextBoolean();

        if(isChoice){
            System.out.println("YAAAYYYYYYYYYY!!!!, you WONNNNNNNN!");
        }
        else{
            System.out.println("COMPUTER WON!");
        }
       */

        //DICE ROLLING

        /*
        int number1;
        int number2;
        int number3;
        int total;

        number1 = random.nextInt(1, 7);
        number2 = random.nextInt(1, 7);
        number3 = random.nextInt(1, 7);

        System.out.println("Dice1: " + number1);
        System.out.println("Dice2: " + number2);
        System.out.println("Dice3: " + number3);

        total = number1 + number2 + number3;
        System.out.println("total: " + total);
       */
    }
}
