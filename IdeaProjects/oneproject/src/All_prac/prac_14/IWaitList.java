package All_prac.prac_14;

/**
 *
 *
 */

public interface IWaitList <E>{
    public void add(E element);
    public E remove();
    public boolean contains(E element);
    public boolean containsAll(WaitList<E> collection);
    public boolean isEmpty();
}
