package lesson22_for_loops;

import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args){

        //MULTIPLICATION TABLE GENERATOR

        Scanner scanner = new Scanner(System.in);

        int number;
        int result;
        int i = 0;

        System.out.println("MULTIPLICATION TABLE GENERATOR");
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        for(i = 1; i <= 10; i++){
            result = number * i;
            System.out.printf("%d X %d = %d\n", number, i, result);
        }

        scanner.close();
    }
}
