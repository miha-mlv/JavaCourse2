package All_prac.prac_11_2_3;
//import All_prac.prac_11_1.Student;

public class Create_Arr extends Student{
    Student[] arr = new Student[3];
    public Create_Arr(){
        for(int i = 0; i < 3; i++)
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
    public void print_arr()
    {
        for (Student student : this.arr) {
            System.out.print(student.score + " ");
        }
        System.out.println();
    }
}
