package Tehtavat2;

import java.util.ArrayList;

class ShoppingList {
    private String name;
    private ArrayList<String> shoppingList = new ArrayList<>();

    ShoppingList(String name) {
        this.name = name;
        this.shoppingList = new ArrayList<>();
    }

    public void addItems(String item) {
        shoppingList.add(item);
    }

    public void removeItems(String item) {
        shoppingList.remove(item);
    }

    public void displayList() {
        for (String item : shoppingList) {
            System.out.println(item);
        }
    }

    public String getName() {
        return name;
    }
}

public class GroceryListManager5 {
    private ArrayList<ShoppingList> groceryList = new ArrayList<>();

    public void addList(ShoppingList listName) {
        groceryList.add(listName);
    }

    public void removeItem(ShoppingList listName) {
        groceryList.remove(listName);
    }

    public void displayAllLists() {
        for (ShoppingList shoppingList : groceryList) {
            System.out.println(shoppingList.getName() + " items: ");
            shoppingList.displayList();
        }
    }

    public boolean checkList(String listName) {
        if (groceryList.contains(listName)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        GroceryListManager5 groceryListManager = new GroceryListManager5();

        ShoppingList bbqList = new ShoppingList("BBQ");
        bbqList.addItems("Burgers");
        bbqList.addItems("Hotdogs");
        bbqList.addItems("Buns");

        ShoppingList campingList = new ShoppingList("Camping");
        campingList.addItems("Tent");
        campingList.addItems("Sleeping Bag");
        campingList.addItems("Flashlight");

        ShoppingList beerList = new ShoppingList("Beer");
        beerList.addItems("IPA");
        beerList.addItems("Stout");
        beerList.addItems("Lager");

        groceryListManager.addList(bbqList);
        groceryListManager.addList(campingList);
        groceryListManager.addList(beerList);

        System.out.println("Grocery Lists:");
        groceryListManager.displayAllLists();

        System.out.println("Removing \"Stout\" from the the " + beerList.getName() + " list...");
        beerList.removeItems("Stout");
        System.out.println("Adding \"Mosquito Repellent\" to the " + campingList.getName() + " list...");
        campingList.addItems("Mosquito Repellent");
        System.out.println("Updated grocerylist: ");
        groceryListManager.displayAllLists();
    }

}