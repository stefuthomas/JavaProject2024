package Tehtavat4;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstNames = {"John", "Alice", "Bob", "Emily", "David"};
        String[] lastNames = {"Smith", "Johnson", "Williams", "Jones", "Brown"};

        System.out.print("How many names shall be generated?");
        int userInput = scanner.nextInt();

        for (int i = 1; i <= userInput; i++ ) {
            System.out.print(i + ". " + firstNames[(int) (Math.random() * firstNames.length)]);
            System.out.println(" " + lastNames[(int) (Math.random() * lastNames.length)]);
        }
    }
}
