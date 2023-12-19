package All_prac.prac_21;

public class ArrayQueueADT {
    private Object[] elements = new Object[10];
    private int size = 0;
    private int head = 0;
    private int tail = 0;

    public  void enqueue(ArrayQueueADT queue, Object element) {
        if(element != null && queue.size < queue.elements.length) {
            queue.elements[queue.tail] = element;
            queue.tail = (queue.tail + 1) % queue.elements.length;
            queue.size++;
        }
    }

    public  Object element(ArrayQueueADT queue) {
        if (!isEmpty(queue)) {
            return queue.elements[queue.head];
        }
        return null;
    }


    public  Object dequeue(ArrayQueueADT queue) {
        assert !isEmpty(queue);
        Object removedElement = queue.elements[queue.head];
        queue.elements[queue.head] = null;
        queue.head = (queue.head + 1) % queue.elements.length;
        queue.size--;
        return removedElement;
    }

    public  int size(ArrayQueueADT queue) {
        return queue.size;
    }

    public  boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    public  void clear(ArrayQueueADT queue) {
        for (int i = 0; i < queue.size; i++) {
            queue.elements[(queue.head + i) % queue.elements.length] = null;
        }
        queue.size = 0;
        queue.head = 0;
        queue.tail = 0;
    }
}
