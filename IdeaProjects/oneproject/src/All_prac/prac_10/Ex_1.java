package All_prac.prac_10;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        rec(n);
    }
    public static void rec(int n)
    {
        if(n == 0)
        {
            return;
        }
        else {
            n = n-1;
            rec(n);
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(n+" ");
        }
    }
}




