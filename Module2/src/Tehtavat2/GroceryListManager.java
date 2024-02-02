package Tehtavat2;

import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item) {
        groceryList.add(item);
    }

    public void removeItem(String item) {
        groceryList.remove(item);
    }

    public void displayList() {
        int num = 0;
        for (int item = 0; item < groceryList.size(); item++) {
            System.out.println(++num + ". " + groceryList.get(item));
        }
    }

    public boolean checkItem(String item) {
        if (groceryList.contains(item)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        GroceryListManager groceryListManager = new GroceryListManager();

        groceryListManager.addItem("Apples");
        groceryListManager.addItem("Milk");
        groceryListManager.addItem("Bread");
        System.out.println("Grocery List:");
        groceryListManager.displayList();

        String itemToCheck = "Milk";
        System.out.println("Is \"" + itemToCheck + "\" in the grocerylist? " + groceryListManager.checkItem(itemToCheck));

        System.out.println("Removing \"" + itemToCheck + "\" from the the list...");
        groceryListManager.removeItem(itemToCheck);
        System.out.println("Updated grocerylist: ");
        groceryListManager.displayList();
    }

}