package All_prac.prac_18.task_5;

import java.util.Scanner;

public class Matrix<T> {
    private T[][] arr;
    private int r;
    private int c;
    Matrix(int r,int c)
    {
        this.r = r;
        this.c = c;
        this.arr = (T[][]) new Object[r][c];
    }
    public void append_matrix()
    {
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                arr[i][j] = (T)scan.nextBigInteger();
            }
        }
    }
    public void printMatrix()
    {
        if(arr.length == arr[0].length) {


            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
