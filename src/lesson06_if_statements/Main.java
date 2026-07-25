package lesson06_if_statements;


//MOVIE TICKET CHECKER

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        //IF STATEMENTS

        System.out.println("WELCOME TO MOVIE TICKET CHECKER!📽️");

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        Boolean isStudent;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a Student? (true/false): ");
        isStudent = scanner.nextBoolean();

        //GROUP 1
        if(name.isBlank()){
            System.out.println("You DID NOT enter your name!🙄");
        }
        else{
            System.out.println("Hello, " + name + "!😁");
        }

        //GROUP 2
        if(age >=65){
            System.out.println("You have got a SENIOR ticket!👴");
        }
        else if(age>=18){
            System.out.println("You have got an ADULT ticket!👩‍🦰");
        }
        else if(age>13){
            System.out.println("You have got a TEEN ticket!👧");
        }
        else{
            System.out.println("You have got a CHILD ticket!👶");
        }


        //GROUP 3
        if(isStudent){
            System.out.println("You ARE a Student!👩‍🎓");
        }
        else{
            System.out.println("You are NOT a Student!");
        }

        scanner.close();
    }
}
