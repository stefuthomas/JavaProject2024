package Tehtavat1;

class ThreadingEven implements Runnable {
    private int numberLowest;
    private int numberHighest;

    public ThreadingEven(int numberLowest, int numberHighest) {
        this.numberHighest = numberHighest;
        this.numberLowest = numberLowest;
    }
    @Override
    public void run() {
        evenNumbers();
    }

    public void evenNumbers() {
        for (int i = this.numberLowest; i <= this.numberHighest; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}

class ThreadingOdd implements Runnable {
    private int numberLowest;
    private int numberHighest;

    public ThreadingOdd(int numberLowest, int numberHighest) {
        this.numberHighest = numberHighest;
        this.numberLowest = numberLowest;
    }

    @Override
    public void run() {
        oddNumbers();
    }

    public void oddNumbers() {
        for (int i = this.numberLowest; i < this.numberHighest; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }

}
public class Task1 {
    public static void main(String[] args) {
        Thread threadingEven = new Thread(new ThreadingEven(1, 100));
        Thread threadingOdd = new Thread(new ThreadingOdd(1, 100));
        threadingEven.start();
        threadingOdd.start();
    }

}
