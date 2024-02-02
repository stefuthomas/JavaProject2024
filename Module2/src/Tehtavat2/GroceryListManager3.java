package Tehtavat2;

import java.util.HashMap;
import java.util.Map;


public class GroceryListManager3 {
    private HashMap<String, Double> groceryList3 = new HashMap<String, Double>();
    private HashMap<String, String> itemCategory = new HashMap<String, String>();
    public void addItemWithCategory(String item, double cost, String category) {
        groceryList3.put(item, cost);
        itemCategory.put(item, category);
    }

    public void removeItemWithCategory(String item) {
        groceryList3.remove(item);
        itemCategory.remove(item);
    }

    public void displayList() {
        int num = 0;
        for (Map.Entry<String, Double> entry : groceryList3.entrySet()) {
            String item = entry.getKey();
            double cost = entry.getValue();
            System.out.println(++num + ". " + item + " " + cost + "€");
        }
    }

    public void displayByCategory(String category) {
        int num = 0;
        for (Map.Entry<String, String> entry : itemCategory.entrySet()) {
            String item = entry.getKey();
            String cat = entry.getValue();
            if (cat.equals(category)) {
                System.out.println(++num + ". " + item);
            }
        }
    }

    public boolean checkItem(String key) {
        if (groceryList3.containsKey(key)) {
            return true;
        } else {
            return false;
        }
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Map.Entry<String, Double> entry : groceryList3.entrySet()) {
            double cost = entry.getValue();
            totalCost += cost;
        }
        return totalCost;
    }

    public static void main(String[] args) {
        GroceryListManager3 groceryListManager = new GroceryListManager3();
        groceryListManager.addItemWithCategory("Milk", 1.89, "Dairy");
        groceryListManager.addItemWithCategory("Bread", 0.99, "Bakery");
        groceryListManager.addItemWithCategory("Butter", 3.95, "Dairy");
        groceryListManager.addItemWithCategory("Cheese", 3.25, "Dairy");
        groceryListManager.addItemWithCategory("Beef", 5.99, "Meat");
        groceryListManager.addItemWithCategory("Chicken", 4.99, "Meat");

        System.out.println("Grocery List:");
        groceryListManager.displayList();

        System.out.println("Dairy items in the grocerylist:");
        groceryListManager.displayByCategory("Dairy");
        System.out.println("Meat items in the grocerylist:");
        groceryListManager.displayByCategory("Meat");

        System.out.printf("Total Cost: %.2f€", groceryListManager.calculateTotalCost());

        System.out.println("\nRemoving item: Cheese");
        groceryListManager.removeItemWithCategory("Cheese");
        System.out.println("Removing item: Chicken");
        groceryListManager.removeItemWithCategory("Chicken");

        System.out.println("Grocery List:");
        groceryListManager.displayList();

        System.out.println("Dairy items in the grocerylist:");
        groceryListManager.displayByCategory("Dairy");
        System.out.println("Meat items in the grocerylist:");
        groceryListManager.displayByCategory("Meat");

        System.out.printf("Total Cost: %.2f€", groceryListManager.calculateTotalCost());
    }
}