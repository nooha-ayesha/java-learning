package lesson24_nested_loops;

import java.util.Scanner;

public class MultiMultiplicationTable{
    public static void main(String[] args){

        // MULTI MULTIPLICATION TABLE

        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 10; j++){
                System.out.printf("%d X %d = % d\n", i, j, i*j);
            }
            System.out.println();
        }

        scanner.close();
    }
}
