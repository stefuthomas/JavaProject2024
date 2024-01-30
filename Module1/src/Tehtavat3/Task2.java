package Tehtavat3;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number:");
        String binary = scanner.nextLine();
        int decimal = 0, multiplier = 0;
        scanner.close();
        for (int i = binary.length() - 1; i >= 0; i --) {
            char bit = binary.charAt(i);
            int bitValue = Character.getNumericValue(bit);
            decimal += bitValue * (Math.pow(2, multiplier));
            multiplier +=1;

        }
        System.out.println(decimal);
    }
}
