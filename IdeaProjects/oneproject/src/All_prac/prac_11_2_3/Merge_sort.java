package All_prac.prac_11_2_3;

public class Merge_sort{
    Merge_sort(){}
    public void Merge(Student[] arr, int n)
    {
        if(n<2){
            return;
        }
        int mid = n/2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n-mid];
        for(int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for(int i = mid; i < n; i++)
        {
            r[i-mid] = arr[i];
        }
        Merge(l,mid);
        Merge(r, n-mid);
        mergik(arr, l,r,mid, n-mid);
    }
    public void mergik(Student[] arr, Student[] l, Student[] r, int left, int right)
    {
        int i = 0, j = 0, k = 0;
        while(i < left && j < right)
        {
            if(l[i].score >= r[j].score)
            {
                arr[k++] = l[i++];
            }
            else {
                arr[k++] = r[j++];
            }
        }
        while(i < left)
        {
            arr[k++] = l[i++];
        }
        while(j < right)
        {
            arr[k++] = r[j++];
        }
    }
}
