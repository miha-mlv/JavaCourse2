package All_prac.prac_11_2_3;


public class Test_SortingStudentsByGPA extends SortingStudentsByGPA{
    public static void main(String[] args) {
        Create_Arr arr = new Create_Arr();
        arr.print_arr();
        SortingStudentsByGPA include = new SortingStudentsByGPA();
        include.Quick_sorting(arr.arr, 0, arr.arr.length-1);
        arr.print_arr();
    }
}
