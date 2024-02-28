package Tehtavat4;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private final Map<String, Double> items = new HashMap<>();

    public void addItem(String item, double cost) {
        items.put(item, cost);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public int getItemCount() {
        return items.size();
    }

    public double calculateTotal() {
        double total = 0;
        for (Map.Entry<String, Double> entry : items.entrySet()) {
            total += entry.getValue();
        }
        return total;
    }
}