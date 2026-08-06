package lesson22_for_loops;

import java.util.Scanner;

public class CountUp{
    public static void main(String[] args) throws InterruptedException {

        //Printing numbers from 1 to 10

        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's Count from 1 to 10");

        System.out.print("Shall we start? yes/no: ");
        String choice = scanner.nextLine();

        if(choice.equalsIgnoreCase("yes")){
            System.out.println("\nstarting...\n");
            for(int i = 1; i <= 10; i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
            System.out.println("🎉 Counting Complete!");
            System.out.println("Thanks for playing.");
        }
        else{
            System.out.println("Goodbye!🥲");
        }

        scanner.close();

    }
}
