package Tehtavat4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many integers in the array? ");
        int size = scanner.nextInt();
        int[] integers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + + (i+1) + ": ");
            integers[i] = scanner.nextInt();
        }
        scanner.close();

        int maxSum = integers[0];
        int startingInex = 0;
        int endingIndex = 0;

        for (int i = 0; i < size; i++) {
            int sum = 0;
            for (int j = i; j < size; j++) {
                sum += integers[j];
                if (sum > maxSum) {
                    maxSum = sum;
                    startingInex = i + 1;
                    endingIndex = j + 1;
                }
            }
        }

        System.out.println("Maximum sum: " + maxSum);
        System.out.println("Integers: " + startingInex +  "-" + endingIndex);
    }
}
