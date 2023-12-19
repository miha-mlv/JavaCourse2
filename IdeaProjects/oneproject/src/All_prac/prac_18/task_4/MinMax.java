package All_prac.prac_18.task_4;

public class MinMax <T extends Comparable<T>>{
    private T[] arr;
    public MinMax(T[] arr){
        this.arr = arr;
    }
    public T findMin()
    {
        if(arr.length == 0)
        {
            return null;
        }
        T min = arr[0];
        for(T item : arr)
        {
            if(item.compareTo(min) < 0){
                min = item;
            }
        }
        return min;
    }
    public T findMax()
    {
        if(arr.length == 0)
        {
            return null;
        }
        T max = arr[0];
        for(T item : arr)
        {
            if(item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }
}

