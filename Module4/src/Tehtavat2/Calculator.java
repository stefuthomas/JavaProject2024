package Tehtavat2;

public class Calculator {
    private int sum;

    public Calculator() {
        sum = 0;
    }

    public void add(int number) {
        try {
            if (number < 0) {
                throw new IllegalArgumentException("Number is negative");
            }
            sum += number;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void reset() {
        sum = 0;
    }

    public int getSum() {
        return sum;
    }

}

class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(5);
        System.out.println(calc.getSum());
        calc.add(-3);
        System.out.println(calc.getSum());
        calc.reset();
        System.out.println(calc.getSum());
    }
}
