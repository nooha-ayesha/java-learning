package lesson22_for_loops;

import java.util.Scanner;

public class EvenExpress{
    public static void main(String[] args){

        //EVEN & ODD NUMBER GENERATOR

        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        int choiceExit = 3;

        System.out.println("EVEN OR ODD NUMBER GENERATOR (1-10)");

        do{
            System.out.println("\nWhat would you like to generate?: ");
            System.out.println("1. EVEN NUMBERS");
            System.out.println("2. ODD NUMBERS");
            System.out.println("3. EXIT");
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            if(choice == 1){
                System.out.println("Generating even numbers 1 to 10");
                for(int i = 2; i <= 10; i+= 2){
                    System.out.println(i);
                }
            }
            else if(choice == 2){
                System.out.println("Generating odd numbers 1 to 10");
                for(int i = 1; i <= 10; i+= 2){
                    System.out.println(i);
                }
            } else if(choice == 3){
                System.out.println("Thank you for using the generator!");
                System.out.println("GOODBYE! 👏");
            } else{
                System.out.println("INVALID CHOICE, Please try again!");
            }
        }while(choice!=choiceExit);

        scanner.close();

    }
}
