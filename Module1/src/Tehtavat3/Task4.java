package Tehtavat3;

import java.util.Scanner;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int correctAnswers = 0;
        do {
            int firstRan = random.nextInt(10) + 1;
            int secondRan = random.nextInt(10) + 1;
            int multiplication = firstRan * secondRan;
            System.out.println("What is " + firstRan + " * " + secondRan + "?");
            int userInput = Integer.parseInt(scanner.nextLine());

            if (userInput == multiplication) {
                correctAnswers += 1;
                System.out.println("Correct answer! Your score is " + correctAnswers + "/10");
            } else {
                System.out.println("Wrong answer! Your score is " + correctAnswers + "/10");
            }

        } while (correctAnswers != 10);
        scanner.close();
    }
}

