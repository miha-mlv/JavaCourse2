package All_prac.last_prac;

public interface Order {
    boolean add(Item item);
    boolean remove(String name);
    int removeAll(String name);
    int getOrderSize();
    Item[] getItems();
    int getTotalPrice();
    int getItemQuantity(String name);
    String[] getDistinctItemNames();
    Item[] getItemsSortedByPriceDesc();
}