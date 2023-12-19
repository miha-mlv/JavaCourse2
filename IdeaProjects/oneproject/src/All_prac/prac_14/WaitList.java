package All_prac.prac_14;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class WaitList<E> implements IWaitList<E> {
    protected Queue<E> content;

    WaitList() {
        content = new ConcurrentLinkedDeque<>();
    }

    public void add(E element) {
        content.add(element);
    }

    public E remove() {
        return content.remove();
    }

    public boolean contains(E element) {
        for (E item : content) {
            if (item == element) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(WaitList<E> collection) {
        if (this.content.size() != collection.content.size()) {
            return false;
        }
        int i = 0, a = 0;
        boolean flag = true;
        for (E item : content) {
            i = 0;
            if (flag == false) {
                return flag;
            }
            for (E item_2 : collection.content) {
                if (i == a) {
                    if (item != item_2) {
                        flag = false;
                        a++;
                        break;
                    }
                }
            }
        }
        return flag;
    }
        public boolean isEmpty ()
        {
            return content.isEmpty();
        }
        WaitList(Queue < E > collection)
        {
            if (collection.size() == 0) {
                return;
            }
            content = new ConcurrentLinkedDeque<>();
            for (E item:collection) {
                content.add(item);
            }
        }
        public String toString ()
        {
            String line = "";
            for (E item : content) {
                line = line + item + " ";
            }
            line = "List: " + line;
            return line;
        }
}
