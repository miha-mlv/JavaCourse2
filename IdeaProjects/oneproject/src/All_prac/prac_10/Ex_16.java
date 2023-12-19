package All_prac.prac_10;

import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println(Max_num(num));
    }
    public static int Max_num(Scanner num)
    {
        int cur_num = num.nextInt();
        if(cur_num == 0)
        {
            return 0;
        }
        int count = Max_num(num);
        if(cur_num > count)
        {
            return 1;
        }
        else if(cur_num == count)
        {
            return count+1;
        }
        else {
            return count;
        }
    }
}
