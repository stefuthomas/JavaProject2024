import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting integer: ");
        int start = Integer.parseInt(scanner.nextLine());
        System.out.println("Ending integer: ");
        int end = Integer.parseInt(scanner.nextLine());
        scanner.close();

        if (start < 0 || end < 0) {
            System.out.println("Negative numbers are not prime numbers");
        } else {
            for (int i = start; i < end; i++) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    System.out.println(i);
                }
            }
        }
    }
}

