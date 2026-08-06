package lesson22_for_loops;

import java.util.Scanner;

public class NewYearCountDown{
    public static void main(String[] args) throws InterruptedException {

        //NEW YEAR COUNTDOWN

        Scanner scanner = new Scanner(System.in);

        System.out.println("NEW YEAR COUNTDOWN!");

        System.out.print("Would you like to start the countdown? yes/no: ");
        String choice = scanner.nextLine();

        if(choice.equalsIgnoreCase("yes")){
            System.out.println("Starting In...");
            for(int i = 3; i > 0; i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
            System.out.println("\nHere we go!!\n");
            for(int i = 10; i > 0; i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
            System.out.println("🎆🎉 HAPPY NEW YEAR! 🎉🎆");
        }
        else{
            System.out.println("GOODBYE!🥲");
        }

        scanner.close();
    }
}
