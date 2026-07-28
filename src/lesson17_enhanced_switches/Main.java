package lesson17_enhanced_switches;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        //enhanced switches

        //Food Ordering System 🍔

        Scanner scanner = new Scanner(System.in);

        String choice;
        int quantity;
        double price=0;
        double total;

        System.out.println("FOOD ORDERING SYSTEM 🍔");
        System.out.println("R - Ramen ($8)");
        System.out.println("H - Hamburger ($12)");
        System.out.println("T - Tacos ($10)");
        System.out.println("Q - Quit");

        System.out.print("Choose your food: ");
        choice = scanner.next().toUpperCase();

        switch(choice){
            case "R" ->{
                price = 8;
                System.out.print("Enter the quantity: ");
                quantity = scanner.nextInt();
                System.out.printf("You have ordered %d Ramen.", quantity);
            }
            case "H" ->{
                price = 12;
                System.out.print("Enter the quantity: ");
                quantity = scanner.nextInt();
                System.out.printf("You have ordered %d Hamburger.", quantity);
            }
            case "T" ->{
                price = 10;
                System.out.print("Enter the quantity: ");
                quantity = scanner.nextInt();
                System.out.printf("You have ordered %d Tacos.", quantity);
            }
            case "Q" ->{
                System.out.println("GOODBYE!😊");
                return;
            }
            default ->{
                System.out.println("INVALID CHOICE!");
                return;
            }

        }

        total = quantity * price;
        System.out.printf("\nTotal Price: $%.2f", total);

        scanner.close();
    }
}
