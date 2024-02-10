package Tehtavat1;

import java.util.TreeMap;

class Counter implements Runnable {
    private int startNum;
    private int endnum;
    private boolean evenNum;
    public Counter(int startNum, int endnum, boolean evenNum) {
        this.startNum = startNum;
        this.endnum = endnum;
        this.evenNum = evenNum;
    }
    @Override
    public void run() {
        if (evenNum) {
            for (int num = startNum; num <= endnum; num++) {
                if (num % 2 == 0) {
                    System.out.println("Even: " + num);
                }
            }
        } else {
            for (int num = startNum; num <= endnum; num++) {
                if (num % 2 != 0) {
                    System.out.println("Odd: " + num);
                }
            }
        }
        System.out.println("Calculating is over");
    }
}
public class Task1 {
    public static void main(String[] args) {
        Thread evenNumbers = new Thread(new Counter(1, 100, true));
        Thread oddNumbers = new Thread(new Counter(1, 100, false));
        evenNumbers.start();
        oddNumbers.start();
    }
}