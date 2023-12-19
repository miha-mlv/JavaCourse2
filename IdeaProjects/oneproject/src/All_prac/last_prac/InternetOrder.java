package All_prac.last_prac;

import java.util.ArrayList;
import java.util.List;

public class InternetOrder {
    private class Node {
        private Item item;
        private Node prev;
        private Node next;

        public Node(Item item) {
            this.item = item;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public InternetOrder() {
        head = new Node(null);
        tail = head;
        size = 0;
    }

    public InternetOrder(Item[] items) {
        this();
        for (Item item : items) {
            add(item);
        }
    }

    public boolean add(Item item) {
        Node newNode = new Node(item);
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
        size++;
        return true;
    }

    public boolean remove(String name) {
        Node current = tail;
        while (current != null) {
            if (current.item.getName().equals(name)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                if (current == tail) {
                    tail = current.prev;
                }
                size--;
                return true;
            }
            current = current.prev;
        }
        return false;
    }

    public int removeAll(String name) {
        int count = 0;
        Node current = tail;
        while (current != null) {
            if (current.item.getName().equals(name)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                if (current == tail) {
                    tail = current.prev;
                }
                count++;
                size--;
            }
            current = current.prev;
        }
        return count;
    }

    public int getOrderSize() {
        return size;
    }

    public Item[] getItems() {
        List<Item> itemList = new ArrayList<>();
        Node current = head.next;
        while (current != null) {
            itemList.add(current.item);
            current = current.next;
        }
        return itemList.toArray(new Item[0]);
    }

    public int getTotalCost() {
        int totalCost = 0;
        Node current = head.next;
        while (current != null) {
            totalCost += current.item.getPrice();
            current = current.next;
        }
        return totalCost;
    }

    public int getItemQuantity(String name) {
        int quantity = 0;
        Node current = head.next;
        while (current != null) {
            if (current.item.getName().equals(name)) {
                quantity++;
            }
            current = current.next;
        }
        return quantity;
    }

    public String[] getDistinctItemNames() {
        List<String> distinctNames = new ArrayList<>();
        Node current = head.next;
        while (current != null) {
            String name = current.item.getName();
            if (!distinctNames.contains(name)) {
                distinctNames.add(name);
            }
            current = current.next;
        }
        return distinctNames.toArray(new String[0]);
    }

    public Item[] getItemsSortedByCostDesc() {
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