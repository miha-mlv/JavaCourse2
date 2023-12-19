package All_prac.prac_19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task_2 {
    public static void main(String[] args) {
        String[] arr = {"23","32","12"};
        Integer[] arr2 = {1,2,3,4,5};
        all_arr<String> obj1 = new all_arr<>(arr);
        all_arr<Integer> obj2 = new all_arr<>(arr2);
        obj1.print_arr();
        obj2.print_arr();
        System.out.println(obj2.getItem(0));
        obj2.toList();
    }
}

class all_arr<E>
{
    E[] data;
    all_arr(E[] data)
    {
        this.data = data;
    }
    void print_arr()
    {System.out.print("[ ");
        for(E item:data)
        {
            System.out.print(item+" ");
        }System.out.print("]");System.out.println();
    }
    E getItem(int index)
    {
        int i = 0;
        for(E item:data)
        {
            if(i == index)
            {
                return item;
            }
            i++;
        }
        return null;
    }
    void toList()
    {
        List<?> list = new ArrayList<E>(Arrays.asList(data));
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
    }
}
