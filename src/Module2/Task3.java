package Module2;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Weight (g): ");
        double grams = Double.parseDouble(reader.nextLine());
        double luotiPerGram = 1 / 13.28;
        int luotiPerNaula = 32;
        int naulaPerLeiviska = 20;

        int leiviska = (int) (grams / (naulaPerLeiviska * luotiPerNaula));
        int weightLeft = (int) (grams % (naulaPerLeiviska * luotiPerNaula));
        int naula = weightLeft / luotiPerNaula;
        double luoti = weightLeft % luotiPerNaula * luotiPerGram;
        System.out.printf("%.0f grams is %d leiviskä, %d naula, and %.2f luoti.%n", grams, leiviska, naula, luoti);

    }
}
