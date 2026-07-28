package lesson16_temperature_converter;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        //TEMPERATURE CONVERTER

        Scanner scanner = new Scanner(System.in);

        String unit;
        double temp;
        double convertedTemp;

        System.out.println("TEMPERATURE CONVERTER");
        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        convertedTemp = (unit.equals("C")) ? (temp - 32) * 9.0 / 5.0 : (temp * 9.0 / 5.0) + 32;

        System.out.printf("The temp in %s is: %f°%s", unit, convertedTemp, unit);

        scanner.close();
    }
}
