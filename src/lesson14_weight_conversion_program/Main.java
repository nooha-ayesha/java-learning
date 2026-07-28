package lesson14_weight_conversion_program;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        //WEIGHT CONVERSION PROGRAM

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("WEIGHT CONVERSION PROGRAM");
        System.out.println("1. Kilograms -> Pounds");
        System.out.println("2. Pounds -> Kilograms");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs: %.2f", newWeight);
        }
        else if(choice == 2){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight / 2.20462;
            System.out.printf("The new weight in kgs: %.2f", newWeight);
        }
        else{
            System.out.println("INVALID CHOICE!");
        }

        scanner.close();
    }
}
