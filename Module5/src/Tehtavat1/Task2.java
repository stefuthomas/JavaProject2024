package Tehtavat1;

import java.util.ArrayList;
class Calculator extends Thread {
    private int start;
    private int end;
    private int[] numbers;
    private int sum;
    Calculator(int start, int end, int[] numbers) {
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
        int size = Runtime.getRuntime().availableProcessors() * 1000;
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random()*100);
        }

        ArrayList<Calculator> calculators = new ArrayList<>();
        calculators.add(new Calculator(0, size/4, numbers));
        calculators.add(new Calculator(size/4, size/2, numbers));
        calculators.add(new Calculator(size/2, numbers.length-1, numbers));

        for (Calculator c : calculators) {
            c.start();
        }

        try {
            for (Calculator c : calculators) {
                c.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int threadSum = 0;
        for (Calculator c : calculators) {
            threadSum += c.getSum();
        }

        System.out.println("Sum of numbers: " + threadSum);
    }
}
