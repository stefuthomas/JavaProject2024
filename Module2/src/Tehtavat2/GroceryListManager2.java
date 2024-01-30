package Tehtavat2;

import java.util.HashMap;
import java.util.Map;


public class GroceryListManager2 {
    private HashMap<String, Double> groceryList2 = new HashMap<String, Double>();

    public void addItem(String item, double cost) {
        groceryList2.put(item, cost);
    }

    public void displayList() {
        int num = 0;
        for (Map.Entry<String, Double> entry : groceryList2.entrySet()) {
            String item = entry.getKey();
            double cost = entry.getValue();
            System.out.println(++num + ". " + item + " " + cost + "€");
        }
    }

    public boolean checkItem(String key) {
        if (groceryList2.containsKey(key)) {
            return true;
        } else {
            return false;
        }
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Map.Entry<String, Double> entry : groceryList2.entrySet()) {
            double cost = entry.getValue();
            totalCost += cost;
        }
        return totalCost;
    }

    public static void main(String[] args) {
        GroceryListManager2 groceryListManager = new GroceryListManager2();
        groceryListManager.addItem("Milk", 1.50);
        groceryListManager.addItem("Bread", 1.00);
        groceryListManager.addItem("Butter", 2.00);
        groceryListManager.addItem("Cheese", 3.00);

        System.out.println("Grocery List:");
        groceryListManager.displayList();

        System.out.println("Total Cost: " + groceryListManager.calculateTotalCost() + "€");

        System.out.println("Removing item: Cheese");
        groceryListManager.groceryList2.remove("Cheese");

        System.out.println("Grocery List:");
        groceryListManager.displayList();

        System.out.println("Total Cost: " + groceryListManager.calculateTotalCost() + "€");

    }
}