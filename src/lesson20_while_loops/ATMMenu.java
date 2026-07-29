package lesson20_while_loops;

import java.util.Scanner;

public class ATMMenu{
    public static void main(String[] args){

        //ATM menu

        //WHILE

        Scanner scanner = new Scanner(System.in);

        double balance = 8000;
        double deposit = 0;
        int choice;
        int choiceExit = 3;

        /*
        System.out.println("ATM MENU");
        System.out.println("1. Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        while(choice != choiceExit){
            if(choice == 1){
                System.out.printf("The balance is: $%.2f\n", balance);
            }
            else if(choice == 2){
                System.out.print("Enter the amount you would like to deposit: ");
                deposit = scanner.nextDouble();
                balance = deposit + balance;
                System.out.printf("The balance is: $%.2f\n", balance);
            }

            System.out.println("ATM MENU");
            System.out.println("1. Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();


        }
        System.out.println("EXITING!");

         */

        //do-while

        do{
            System.out.println("ATM MENU");
            System.out.println("1. Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            if(choice == 1){
                System.out.printf("The balance is: $%.2f\n", balance);
            }
            else if(choice == 2){
                System.out.print("Enter the amount you would like to deposit: ");
                deposit = scanner.nextDouble();
                balance = deposit + balance;
                System.out.printf("The balance is: $%.2f\n", balance);
            }


        }while(choice != choiceExit);

        System.out.println("EXITING!");

       scanner.close();

    }
}
