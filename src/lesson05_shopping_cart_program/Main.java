package lesson05_shopping_cart_program;


import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String item;
        int quantity;
        double price;
        char currency='$';
        double total;

        System.out.print("What would you like to buy?: ");
        item = scanner.nextLine();

        System.out.println("How much would you like to buy?: ");
        quantity = scanner.nextInt();

        System.out.println("What's the price of the item: ");
        price = scanner.nextDouble();

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");

        total = price*quantity;
        System.out.print("The total price is: " + currency + total);

        scanner.close();
    }


}
