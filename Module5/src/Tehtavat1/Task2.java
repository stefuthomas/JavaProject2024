package Tehtavat1;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

class Calculator extends Thread {
    private int start;
    private int end;
    private int[] numbers;
    private int sum;
    public Calculator(int start, int end, int[] numbers) {
        this.start = start;
        this.end = end;
        this.numbers = numbers;
        this.sum = 0;
    }

    @Override
    public void run() {
        sum = sumNumbers();
    }

    public int sumNumbers() {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += numbers [i];
        }
        return sum;
    }

    public int getSum() {
        return sum;
    }

}
public class Task2 {
    public static void main(String[] args) {
        int[] numbersToCalculate;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numbers: ");
        int size = scanner.nextInt();
        numbersToCalculate = new int[size];

        for (int i = 0; i < size; i++) {
            numbersToCalculate[i] = (int) (Math.random() * 100);
        }
        ArrayList<Calculator> calculators = new ArrayList<>();
        calculators.add(new Calculator(0, size / 4 - 1, numbersToCalculate));
        calculators.add(new Calculator(size / 4, size / 2 - 1, numbersToCalculate));
        calculators.add(new Calculator(size / 2, size / 4 * 3 - 1, numbersToCalculate));
        calculators.add(new Calculator(size / 4 * 3, size - 1, numbersToCalculate));

        for (Calculator calculator : calculators) {
            calculator.start();
        }

        for (Calculator calculator : calculators) {
            try {
                calculator.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int threadedSum = 0;

        for (Calculator calculator : calculators) {
            System.out.println("Threadded calculator sum: " + calculator.getSum());
            threadedSum += calculator.getSum();
        }

        System.out.println("Threaded sum: " + threadedSum);
    }
}
