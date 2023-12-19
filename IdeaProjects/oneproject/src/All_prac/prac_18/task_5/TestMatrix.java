package All_prac.prac_18.task_5;

public class TestMatrix {
    static Integer[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
    public static void main(String[] args) {
        Matrix<Integer> matrix = new Matrix<>(3,3);
        matrix.append_matrix();
        matrix.printMatrix();
    }

}
