package All_prac.prac_21;

public class ArrayQueue {
    private Object[] elements = new Object[10];
    private int size = 0; //размер задается при создании очередт
    private int head = 0;
    private int tail = 0;

    public void enqueue(Object element) {
        if(element != null && size < elements.length) {
            elements[tail] = element;
            tail = (tail + 1) % elements.length;
            size++;
        }
    }

    public Object element() {
        assert !isEmpty();
        return elements[head];
    }

    public Object dequeue() {
        assert !isEmpty();
        Object removedElement = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return removedElement;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[(head + i) % elements.length] = null;
        }
        size = 0;
        head = 0;
        tail = 0;
    }
    public void print_queue(ArrayQueue queue)
    {
        for(int i = 0; i < queue.size(); i++)
        {
            System.out.print(queue.elements[i] + " ");
        }
    }
}
