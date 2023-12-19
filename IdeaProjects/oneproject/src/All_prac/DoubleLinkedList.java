package All_prac;
public class DoubleLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    private static class Node<T> {
        int data;
        Node<T> next;
        Node<T> prev;

        Node(int data) {
            this.data = data;
        }
    }

    public void addLast(int data) {
        Node<T> newNode = new Node<>(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public String to_String()
    {
        String line = "";
        Node broker = this.head;
        while(broker.next != null)
        {
            line = line + Integer.toString(broker.data);
            broker = broker.next;
        }
        return line;
    }

    public int poll() {
        if (head == null) {
            return -1;
        }
        int data = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        return data;
    }

    public boolean isEmpty() {
        return head == null;
    }
}