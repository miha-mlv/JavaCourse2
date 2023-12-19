package All_prac.prac_11_2_3;

public class SortingStudentsByGPA implements Comparator{
    public void Quick_sorting(Student[] arr, int begin, int end)
    {
        if(begin < end)
        {
            int Index = reposition(arr,begin,end);
            Quick_sorting(arr, begin, Index - 1);
            Quick_sorting(arr, Index+1, end);
        }
    }
    private int reposition(Student[] arr, int begin, int end)
    {
        Student im = arr[end];
        int i = begin-1;
        for(int j = begin; j < end; j++)
        {
            if(arr[j].score <= im.score)
            {
                i++;
                Student swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
        }
        Student swap = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swap;
        return i+1;
    }
}
