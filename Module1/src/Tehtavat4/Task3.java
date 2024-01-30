package Tehtavat4;

import java.util.ArrayList;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        ArrayList<Integer> nonDup = new ArrayList<>();
        for ( int num : numbers) {
            if (!nonDup.contains(num)) {
                nonDup.add(num);
            }
        }

        System.out.println("The array without duplicates:");
        for (int num : nonDup) {
            System.out.print(num + " ");
        }
    }
}