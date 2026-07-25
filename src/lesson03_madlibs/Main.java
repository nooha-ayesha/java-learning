package lesson03_madlibs;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        //MAD LIBS GAME

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb;
        String adjective3;

        System.out.print("Enter an adjective(description): ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a noun(animal or person): ");
        noun1 = scanner.nextLine();

        System.out.print("Enter an adjective(description): ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter a verb ends with -ing(action): ");
        verb = scanner.nextLine();

        System.out.print("Enter an adjective(description): ");
        adjective3 = scanner.nextLine();

        System.out.println("\nI went to a " + adjective1 + " library." );
        System.out.println("In the library, I saw a " + noun1);
        System.out.println("It was very " + adjective2);
        System.out.println("The " + noun1 + " was " + verb + " his head");
        System.out.println("I was so " + adjective3 + " !");

        scanner.close();
    }

}

