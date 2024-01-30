package Tehtavat3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first coefficient:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Input the second coefficient:");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Input the third coefficient:");
        int c = Integer.parseInt(scanner.nextLine());

        double discriminant = Math.pow(b, 2) - (4 * a * c);
        if (discriminant >= 0) {
            double firstRoot = (-b + Math.sqrt(discriminant)) / (2 * a);
            double secondRoot = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Roots are: %.1f & %.1f", firstRoot, secondRoot);

        }
    }
}
