package lesson19_logical_operators;

import java.util.Scanner;

public class ExamEligibilityChecker{
    public static void main(String[] args){

        //EXAM ELIGIBILITY CHECKER

        Scanner scanner = new Scanner(System.in);

        double attendance;
        boolean isPaid;
        boolean isSubmitted;

        System.out.print("Enter your attendance percentage: %");
        attendance = scanner.nextDouble();

        System.out.print("Have you paid your entire exam fee? (true/false): ");
        isPaid = scanner.nextBoolean();

        System.out.print("Have you submitted any medical certificate? (true or false): ");
        isSubmitted = scanner.nextBoolean();

        if(!isPaid && (attendance >= 75 || isSubmitted)){
            System.out.println("EXAM FEE MUST BE PAID!");
        }
        else if(isPaid && (!isSubmitted && attendance < 75)){
            System.out.println("PLEASE PROVIDE THE MEDICAL CERTIFICATE!");
        }
        else if(isPaid && (isSubmitted && attendance < 75)){
            System.out.println("YOU ARE ELIGIBLE TO WRITE THE EXAMINATION CONSIDERING THE MEDICAL CERTIFICATE!");
        }
        else if((isPaid && attendance >= 75) || isSubmitted){
            System.out.println("YOU ARE ELIGIBLE TO ATTEND THE EXAMINATION!");
        }
        else{
            System.out.println("YOU ARE NOT ELIGIBLE TO ATTEND THE EXAMINATION!");
        }

        scanner.close();
    }
}
