import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Weight (g): ");
        int grams = Integer.parseInt(scanner.nextLine());

        final double LUOTIGR = 13.28;
        final double NAULAGR = LUOTIGR * 32;
        final double LEIVISKAGR = NAULAGR * 20;

        int leiviskaAmount = (int) (grams / LEIVISKAGR);
        double remainingWeight = grams - LEIVISKAGR * leiviskaAmount;

        int naulaAmount = (int) (remainingWeight / NAULAGR);
        remainingWeight = remainingWeight - NAULAGR * naulaAmount;
        double luotiAmount = (remainingWeight / LUOTIGR);

        System.out.printf("%d grams is %d leiviskä, %d naula, and %.2f luoti." ,grams, leiviskaAmount, naulaAmount, luotiAmount);

    }
}