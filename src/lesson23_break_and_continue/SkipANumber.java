package lesson23_break_and_continue;

import java.util.Random;

public class SkipANumber{
    public static void main(String[] args){

        //SKIP A NUMBER

        Random random = new Random();

        System.out.println("NUMBER BOMB 💣");
        System.out.println("\nBOMB IS HIDDEN RANDOMLY");

        int randomNumber = random.nextInt(1,11);

        for(int i = 1; i <= 10; i++){
            if(i == randomNumber){
                System.out.println("BOOOM! 💣");
                System.out.println("The number was " + randomNumber);
                System.out.println("\nGAME OVER.");
                break;
            }
            System.out.println(i);
        }
    }
}