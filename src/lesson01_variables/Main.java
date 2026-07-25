package lesson01_variables;

public class Main {
    public static void main(String[] args){
        String car = "Porsche 911 GT3";
        String color = "wine";
        double Price = 2999.99;
        char currency = '$';
        Boolean forsale = false;


        System.out.println("The price for " + color + " " + car + " is: " + currency + Price);
        if(forsale){
            System.out.println("There is a " + car + "for sale!");
        }
        else{
            System.out.println("The " + car + " is not for sale");
        }
    }

}
