package All_prac.prac_11_1;

public class Create_arr extends Student{
    Student[] arr = new Student[5];
    Create_arr(){
        for(int i = 0; i < 5; i++)
        {
            arr[i] = new Student(random_num());
        }
    }
    public static int  num = 1;
    public static int random_num()
    {
        int a = 41;
        int b = 11119;
        int c = 11113;
        num = (a*num+b)%c;
        return num;
    }
    public void Sorting_arr()
    {
        //Student[] buf_arr = new Student[20];
        for(int i = 0; i < arr.length; i++)
        {
            Student t = arr[i];
            int j = i - 1;
            for(; j >= 0; j--)
            {
                if(arr[j].iDNumber > t.iDNumber)
                {
                    arr[j+1] = arr[j];
                }
                else {
                    break;
                }
            }
            arr[j+1] = t;

        }
    }

}
