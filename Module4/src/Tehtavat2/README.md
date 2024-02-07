`public class Calculator {
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
}`

Explain the code:
The Calculator class has a private sum variable, a constructor that sets sum to 0, and three methods: add, reset, and getSum.
The add method takes an integer number as a parameter and adds it to sum variable. If the number is negative, an Exception is thrown.
The reset method sets sum to 0.
The getSum method returns the value of sum variable.
The Main class creates a Calculator object, adds 5 to the sum, tries to subtract -3, prints the sum, resets the sum and then displays the sum variable.
