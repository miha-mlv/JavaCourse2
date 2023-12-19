package All_prac.prac_22_23;

public interface Order {
    boolean addPosition(Item item);
    boolean removePosition(String itemName);
    int removeAll(String itemName);
    int getTotalItems();
    Item[] getItems();
    int getTotalCost();
    int getItemQuantity(String itemName);
    String[] getItemNames();
    Item[] getSortedItemsByPrice();
}