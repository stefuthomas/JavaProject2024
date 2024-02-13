package Tehtavat2;

import java.util.ArrayList;

class LaptopStorage {
    private static ArrayList<String> storage = new ArrayList<>();

    public synchronized static void addToStorage(String item) {
        storage.add(item);
    }

    public synchronized static boolean removeFromStorage(String item) {
        if (storage.contains(item)) {
            storage.remove(item);
            return true;
        } else {
            return false;
        }
    }

    public synchronized static int getStorageSize() {
        return storage.size();
    }
}

class Worker extends Thread {
    private static int i = 0;
    private int workerId;
    private String item;
    private boolean add;

    Worker(String item, boolean add) {
        this.item = item;
        workerId = ++i;
        this.add = add;
    }

    @Override
    public void run() {
        synchronized (LaptopStorage.class) {
            if (add) {
                LaptopStorage.addToStorage(item);
                System.out.println("Worker " + workerId + " added " + item + " to storage.");
            } else {
                if (LaptopStorage.removeFromStorage(item)) {
                    System.out.println("Worker " + workerId + " removed " + item + " from storage.");
                } else {
                    System.out.println("Worker " + workerId + " tried to remove " + item + " from storage, but it was not found.");
                }
            }
        }
    }
}

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            workers.add(new Worker("Laptop " + i, true));
            workers.add(new Worker("Laptop " + i, false));
        }
        for (Worker worker : workers) {
            worker.start();
            try {
                worker.join();
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
        System.out.println("Storage size: " + LaptopStorage.getStorageSize());
    }
}