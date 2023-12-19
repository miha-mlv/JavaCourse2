package All_prac.prac_14;
public class UnfairWaitList<E> extends WaitList<E>{
    UnfairWaitList(){}
    public void add(E element)
    {
        this.content.add(element);
    }
    public void remove(E element)
    {
        this.content.remove(element);
    }
    public void moveToBack(E element)
    {
        for(E item:this.content)
        {
            if(item == element)
            {
                break;
            }
            System.out.print(item+ " ");
        }
        System.out.println();
    }
}
