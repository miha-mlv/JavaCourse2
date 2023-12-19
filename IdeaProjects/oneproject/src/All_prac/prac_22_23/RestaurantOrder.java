package All_prac.prac_22_23;

import java.util.*;

public class RestaurantOrder implements Order {
    private List<Item> items;

    public RestaurantOrder() {
        this.items = new ArrayList<>();
    }

    @Override
    public boolean addPosition(Item item) {
        return items.add(item);
    }

    @Override
    public boolean removePosition(String itemName) {
        for (int i = items.size() - 1; i >= 0; i--) {
            if (items.get(i).getName().equals(itemName)) {
                items.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        int count = 0;
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equals(itemName)) {
                iterator.remove();
                count++;
            }
        }
        return count;
    }

    @Override
    public int getTotalItems() {
        return items.size();
    }

    @Override
    public Item[] getItems() {
        return items.toArray(new Item[0]);
    }

    @Override
    public int getTotalCost() {
        int totalCost = 0;
        for (Item item : items) {
            totalCost += item.getCost();
        }
        return totalCost;
    }

    @Override
    public int getItemQuantity(String itemName) {
        int count = 0;
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String[] getItemNames() {
        Set<String> itemNames = new HashSet<>();
        for (Item item : items) {
            itemNames.add(item.getName());
        }
        return itemNames.toArray(new String[0]);
    }

    @Override
    public Item[] getSortedItemsByPrice() {
        Item[] sortedItems = items.toArray(new Item[0]);
        Arrays.sort(sortedItems, Comparator.comparingInt(Item::getCost).reversed());
        return sortedItems;
    }
}