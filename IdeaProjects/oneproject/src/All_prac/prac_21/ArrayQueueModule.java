package All_prac.prac_21;

public class ArrayQueueModule {
    private static Object[] elements = new Object[10];// является инвариантом, так как размер задается при создании очереди
    private static int size = 0;
    private static int head = 0;
    private static int tail = 0;

    public void enqueue(Object element) {// предусловие в очереди есть место
        if(element != null) {
            //ensureCapacity(size + 1);
            if(size < elements.length) {
                elements[tail] = element;
                tail = (tail + 1) % elements.length;
                size++;
            }
        }
    }// постусловие - элемент добавлен в конец очереди

    public Object element() {//предусловие - очередь не пустая
        if(!isEmpty()) {
            return elements[head];
        }
        return null;
    }// постусловие - возвращает первый элемент

    public Object dequeue() {// предусловие - очередь не должна быть пустой
        if(!isEmpty()) {
            Object removedElement = elements[head];
            elements[head] = null;
            head = (head + 1) % elements.length;
            size--;
            return removedElement;
        }
        return null;
    }// постусловие - возвращает первый элемент очереди


    public int size() {
        return size;// постусловие - возвращает текщее количество элементов в очереди
    }

    public boolean isEmpty() {
        return size == 0;// постусловие - возвращает true, false
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[(head + i) % elements.length] = null;
        }
        size = 0;
        head = 0;
        tail = 0;
    }// постусловие - в очереди нету элементов
}