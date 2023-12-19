package All_prac.prac_11_1;

public class Test_CreateArr extends Create_arr{
    public static void main(String[] args) {
        Create_arr arr = new Create_arr();
        for(int i = 0; i < arr.arr.length; i++)
        {
            System.out.print(arr.arr[i].iDNumber + " ");
        }
        arr.Sorting_arr();
        System.out.println();
        for(int i = 0; i < arr.arr.length; i++)
        {
            System.out.print(arr.arr[i].iDNumber + " ");
        }
    }
}
