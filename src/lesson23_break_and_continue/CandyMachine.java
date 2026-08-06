package lesson23_break_and_continue;

public class CandyMachine {
    public static void main(String[] args){

        // CANDY MACHINE

        int candy;

        System.out.println("🍬 CANDY MACHINE");
        System.out.println("\n CAUTION! SOME CANDIES MIGHT BE RANDOMLY SPOILED\n");

        for(int i = 1; i <= 10; i++){
            if(i == 6){
                System.out.println("OOPS! 🍬 Candy " + i + " is SPOILED!");
                System.out.println("YOU ARE DEAD! ☠️");
                continue;
            }
            System.out.println("🍬 Candy " + i);
        }

    }
}
