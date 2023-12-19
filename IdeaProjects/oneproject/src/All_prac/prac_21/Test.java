package All_prac.prac_21;

public class Test {
    public static void main(String[] args) {
        ArrayQueueModule queueModule = new ArrayQueueModule();
        queueModule.enqueue(1);
        queueModule.enqueue(2);
        queueModule.enqueue(3);
        System.out.println("ArrayQueueModule");
        System.out.println("size="+queueModule.size());
        queueModule.clear();
        System.out.println("size="+queueModule.size()); System.out.println();

        ArrayQueueADT queueADT = new ArrayQueueADT();
        queueADT.enqueue(queueADT,1);
        queueADT.enqueue(queueADT,2);
        queueADT.enqueue(queueADT,3);
        System.out.println("ArrayQueueADT");
        System.out.println("size="+queueADT.size(queueADT));
        queueADT.clear(queueADT);
        System.out.println("size="+queueADT.size(queueADT)); System.out.println();

        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("ArrayQueueADT");
        System.out.println("size="+queue.size());
        queue.clear();
        System.out.println("size="+queue.size()); System.out.println();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.size());
        queue.print_queue(queue);
    }
}
