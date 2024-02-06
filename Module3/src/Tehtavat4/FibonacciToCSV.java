package Tehtavat4;

import java.io.*;

public class FibonacciToCSV {
    public static long[] generateFibonacci(int size) {
        long[] fibonacci = new long[size];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < size; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    public static void writeFibonacci(String file, long[] fibonacci) {
        try (Writer writer = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            for (long num : fibonacci) {
                bufferedWriter.write(String.valueOf(num));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        long[] fib = generateFibonacci(100);
        writeFibonacci("fibonacci.csv", fib);
    }
}
