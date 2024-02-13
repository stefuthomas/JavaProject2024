package Tehtavat1;

import java.util.ArrayList;
import java.util.List;

class Calculator extends Thread {
    private static int i = 0;
    private int subSum = 0;
    private int calculatorId;
    private List<Integer> numbersToCalculate;

    Calculator(List<Integer> numbersToCalculate) {
        this.calculatorId = ++i;
        this.subSum = 0;
        this.numbersToCalculate = numbersToCalculate;
    }

    @Override
    public void run() {
        for (int i = 0; i < numbersToCalculate.size(); i++) {
            int number = numbersToCalculate.get(i);
            System.out.println("Calculator " + calculatorId + " calculating: " + number);
            subSum += number;
        }
    }

    public int getCalculatorId() {
        return calculatorId;
    }

    public int getSubSum() {
        return subSum;
    }
}

class Numbers {
    private ArrayList<Integer> numbers;
    private ArrayList<Tehtavat1.Calculator> calculators;
    private int sum;

    public Numbers() {
        this.numbers = new ArrayList<>();
        this.calculators = new ArrayList<>();
        this.sum = 0;
        setNumbers();
        setCalculators();
    }

    public void setNumbers() {
        for (int i = 0; i < 100; i++) {
            numbers.add((int) (Math.random() * 10) + 1);
        }
    }

    public void setCalculators() {
        calculators.add(new Calculator(numbers.subList(0, 25)));
        calculators.add(new Calculator(numbers.subList(25, 50)));
        calculators.add(new Calculator(numbers.subList(50, 75)));
        calculators.add(new Calculator(numbers.subList(75, 100)));
    }

    public void calculate() {
        for (Calculator calculator : calculators) {
            calculator.start();
        }
        for (Calculator calculator : calculators) {
            try {
                calculator.join();
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
        for (Calculator calculator : calculators) {
            int subSum = calculator.getSubSum();
            System.out.println("Calculator " + calculator.getCalculatorId() + ". calculated sub sum: " + subSum);
            sum += subSum;
        }

        printResults();
    }
    public void printResults() {
        System.out.println("Total sum calculated: " + sum);
    }
}

public class Task2 {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.calculate();
    }
}
