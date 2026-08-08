package lesson24_nested_loops;

import java.util.Scanner;

public class NumberGrid{
    public static void main(String[] args) {

        // NUMBER GRID

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= columns; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
