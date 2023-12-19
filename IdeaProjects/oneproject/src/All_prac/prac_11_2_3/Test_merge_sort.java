package All_prac.prac_11_2_3;

public class Test_merge_sort extends Create_Arr{
    public static void main(String[] args) {
        Create_Arr arr_1 = new Create_Arr();
        Create_Arr arr_2 = new Create_Arr();
        arr_1.print_arr();
        arr_2.print_arr();
        Student[] arr = merge_arr(arr_1.arr,arr_2.arr);
        Merge_sort m = new Merge_sort();
        m.Merge(arr,arr.length);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i].score + " ");
        }
    }
    private static Student[] merge_arr(Student[] arr_1, Student[] arr_2)
    {
        Student[] arr = new Student[6];
        for(int i = 0; i < 3; i++)
        {
            arr[i] = arr_1[i];
            arr[i+3] = arr_2[i];
        }
        return arr;
    }
}
