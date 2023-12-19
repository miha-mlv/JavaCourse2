package All_prac.prac_22_23;

import java.util.HashMap;
import java.util.Map;

public class OrderManager {
    private Map<String, Order> ordersMap;

    public OrderManager() {
        this.ordersMap = new HashMap<>();
    }

    public void addOrder(String address, Order order) throws OrderAlreadyAddedException {
        if (ordersMap.containsKey(address)) {
            throw new OrderAlreadyAddedException("Order already added for address: " + address);
        }
        ordersMap.put(address, order);
    }

    public Order getOrder(String address) {
        return ordersMap.get(address);
    }

    public void removeOrder(String address) {
        ordersMap.remove(address);
    }

    public void addPositionToOrder(String address, Item item) throws OrderAlreadyAddedException {
        Order order = ordersMap.get(address);
        if (order != null) {
            order.addPosition(item);
        } else {
            throw new OrderAlreadyAddedException("Order not found for address: " + address);
        }
    }

    public Order[] getAllOrders() {
        return ordersMap.values().toArray(new Order[0]);
    }

    public int getTotalCostOfOrders() {
        int totalCost = 0;
        for (Order order : ordersMap.values()) {
            totalCost += order.getTotalCost();
        }
        return totalCost;
    }

    public int getTotalItemQuantityAcrossOrders(String itemName) {
        int totalQuantity = 0;
        for (Order order : ordersMap.values()) {
            totalQuantity += order.getItemQuantity(itemName);
        }
        return totalQuantity;
    }
}
