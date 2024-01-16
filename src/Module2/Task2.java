package Module2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("What is the length of the first leg? ");
        Double first = Double.parseDouble(reader.nextLine());
        System.out.print("What is the length of the second leg? ");
        Double second = Double.parseDouble(reader.nextLine());
        Double hypotenuse = Math.sqrt(Math.pow(first, 2) + Math.pow(second, 2));
        System.out.println("The hypotenuse is " + hypotenuse);
    }
}
