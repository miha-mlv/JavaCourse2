package All_prac.last_prac;

import java.util.ArrayList;
import java.util.List;

public class RestaurantOrder implements Order {
    private final List<Item> items;

    public RestaurantOrder() {
        items = new ArrayList<>();
    }

    @Override
    public boolean add(Item item) {
        return items.add(item);
    }

    @Override
    public boolean remove(String name) {
        for (int i = items.size() - 1; i >= 0; i--) {
            if (items.get(i).getName().equals(name)) {
                items.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public int removeAll(String name) {
        int count = 0;
        for (int i = items.size() - 1; i >= 0; i--) {
            if (items.get(i).getName().equals(name)) {
                items.remove(i);
                count++;
            }
        }
        return count;
    }

    @Override
    public int getOrderSize() {
        return items.size();
    }

    @Override
    public Item[] getItems() {
        return items.toArray(new Item[0]);
    }

    @Override
    public int getTotalPrice() {
        int totalCost = 0;
        for (Item item : items) {
            totalCost += item.getPrice();
        }
        return totalCost;
    }

    @Override
    public int getItemQuantity(String name) {
        int quantity = 0;
        for (Item item : items) {
            if (item.getName().equals(name)) {
                quantity++;
            }
        }
        return quantity;
    }

    @Override
    public String[] getDistinctItemNames() {
        List<String> distinctNames = new ArrayList<>();
        for (Item item : items) {
            String name = item.getName();
            if (!distinctNames.contains(name)) {
                distinctNames.add(name);
            }
        }
        return distinctNames.toArray(new String[0]);
    }

    @Override
    public Item[] getItemsSortedByPriceDesc() {
        Item[] items = getItems();
        for (int i = 0; i < items.length - 1; i++) {
            for (int j = 0; j < items.length - i - 1; j++) {
                if (items[j].getPrice() < items[j + 1].getPrice()) {
                    Item temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
        return items;
    }
}