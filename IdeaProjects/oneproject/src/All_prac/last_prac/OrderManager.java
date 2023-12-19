package All_prac.last_prac;

import java.util.HashMap;
import java.util.Map;

public class OrderManager {
    private final Map<Integer, Order> tableOrders;
    private final Map<String, Order> addressOrders;

    public OrderManager() {
        tableOrders = new HashMap<>();
        addressOrders = new HashMap<>();
    }

    public void addOrder(int tableNumber, Order order) {
        if (!tableOrders.containsKey(tableNumber)) {
            tableOrders.put(tableNumber, order);
        } else {
            throw new OrderAlreadyAddedException("Order for this table already exists.");
        }
    }

    public void addOrder(String address, Order order) {
        if (!addressOrders.containsKey(address)) {
            addressOrders.put(address, order);
        } else {
            throw new OrderAlreadyAddedException("Order for this address already exists.");
        }
    }

    public void removeOrder(int tableNumber) {
        if (tableOrders.containsKey(tableNumber)) {
            tableOrders.remove(tableNumber);
        } else {
            throw new IllegalTableNumber("No order found for the table number: " + tableNumber);
        }
    }

    public void removeOrder(String address) {
        if (addressOrders.containsKey(address)) {
            addressOrders.remove(address);
        } else {
            throw new OrderAlreadyAddedException("No order found for the address: " + address);
        }
    }

    public int getOrdersCount() {
        return tableOrders.size() + addressOrders.size();
    }

    public int getTotalPrice(int tableNumber) {
        Order order = tableOrders.get(tableNumber);
        if (order != null) {
            return order.getTotalPrice();
        }
        throw new IllegalTableNumber("No order found for the table number: " + tableNumber);
    }

    public int getTotalPrice(String address) {
        Order order = addressOrders.get(address);
        if (order != null) {
            return order.getTotalPrice();
        }
        throw new OrderAlreadyAddedException("No order found for the address: " + address);
    }

    public Order getOrder(int tableNumber) {
        return tableOrders.get(tableNumber);
    }

    public Order getOrder(String address) {
        return addressOrders.get(address);
    }

    public Order[] getInternetOrders() {
        return addressOrders.values().toArray(new Order[0]);
    }

    public int getTotalItemQuantity(String itemName) {
        int totalQuantity = 0;
        for (Order order : tableOrders.values()) {
            totalQuantity += order.getItemQuantity(itemName);
        }
        for (Order order : addressOrders.values()) {
            totalQuantity += order.getItemQuantity(itemName);
        }
        return totalQuantity;
    }

    public int getTotalOrdersPrice(String itemName) {
        int totalCost = 0;
        for (Order order : tableOrders.values()) {
            totalCost += order.getItemQuantity(itemName) * order.getItemsSortedByPriceDesc()[0].getPrice();
        }
        for (Order order : addressOrders.values()) {
            totalCost += order.getItemQuantity(itemName) * order.getItemsSortedByPriceDesc()[0].getPrice();
        }
        return totalCost;
    }
}