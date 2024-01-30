package Tehtavat2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Input temperature in Fahrenheit. ");
        Double fahrenheit = Double.parseDouble(reader.nextLine());
        Double celcius = (fahrenheit - 32) / 1.8;
        System.out.println(fahrenheit + " Fahrenheit is " + celcius + " in Celcius.");
    }
}
