package lesson24_nested_loops;

import java.util.Scanner;

public class CheckerBoard{
    public static void main(String[] args){

        // CHECKER BOARD

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        System.out.print("Enter the symbol: ");
        char symbol = scanner.next().charAt(0);

        for(int i = 1; i <= rows; i++){
            if(i % 2 == 0){
                System.out.print(" ");
            }
            for(int j =1; j <= columns; j++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
