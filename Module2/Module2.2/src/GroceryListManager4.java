import java.util.HashMap;
import java.util.Map;


public class GroceryListManager4 {
    private Map<String, Integer> groceryList4 = new HashMap<String, Integer>();
    public void addItemWithQuantity(String item, int quantity) {
        if (groceryList4.containsKey(item)) {
            int currentQuantity = groceryList4.get(item);
            groceryList4.put(item, currentQuantity + quantity);
        } else {
            groceryList4.put(item, quantity);
        }
    }

    public void updateQuantity(String item, int quantity) {
        if (groceryList4.containsKey(item)) {
            groceryList4.put(item, quantity);
        } else {
            System.out.println("Grocerylist doesn't contain this type of item.");
        }
    }


    public void displayList() {
        int num = 0;
        for (Map.Entry<String, Integer> entry : groceryList4.entrySet()) {
            String item = entry.getKey();
            int quantity = entry.getValue();
            if (quantity > 0) {
                System.out.println(++num + ". " + item + " quantity " + quantity + ".");
            } else {
                System.out.println(++num + ". " + item + " No items");
            }
        }
    }



    public boolean checkItem(String key) {
        if (groceryList4.containsKey(key)) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        GroceryListManager4 groceryListManager = new GroceryListManager4();
        groceryListManager.addItemWithQuantity("Milk", 3);
        groceryListManager.addItemWithQuantity("Bread", 2);
        groceryListManager.addItemWithQuantity("Cheese", 5);
        groceryListManager.addItemWithQuantity("Eggs", 12);
        groceryListManager.addItemWithQuantity("Yogurt", 4);
        groceryListManager.addItemWithQuantity("Soap", 0);
        System.out.println("Grocery List:");
        groceryListManager.displayList();

        System.out.println("Removing 6 eggs from the list.");
        groceryListManager.updateQuantity("Eggs", 6);
        System.out.println("Adding 3 Chickens to the list.");
        groceryListManager.addItemWithQuantity("Chicken", 3);

        System.out.println("Grocery List:");
        groceryListManager.displayList();

        System.out.println("Adding 2 soaps and adding 1 more bread to the list.");
        groceryListManager.addItemWithQuantity("Bread", 1);
        groceryListManager.addItemWithQuantity("Soap", 2);

        System.out.println("Grocery List:");
        groceryListManager.displayList();

    }
}