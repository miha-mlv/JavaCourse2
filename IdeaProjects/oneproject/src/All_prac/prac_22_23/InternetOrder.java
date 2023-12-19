package All_prac.prac_22_23;

public class InternetOrder {
    private static class Node {
        Item item;
        Node next;
        Node prev;

        Node(Item item) {
            this.item = item;
        }
    }

    private Node head;

    // Конструкторы
    public InternetOrder() {
        this.head = new Node(null); // Головной элемент
        this.head.next = this.head;
        this.head.prev = this.head;
    }

    public InternetOrder(Item[] items) {
        this();
        for (Item item : items) {
            addPosition(item);
        }
    }

    // Методы
    public boolean addPosition(Item item) {
        Node newNode = new Node(item);
        newNode.next = head.next;
        newNode.prev = head;
        head.next.prev = newNode;
        head.next = newNode;
        return true;
    }

    public boolean removePosition(String itemName) {
        Node current = head.prev;
        while (current != head) {
            if (current.item.getName().equals(itemName)) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                return true;
            }
            current = current.prev;
        }
        return false;
    }
}