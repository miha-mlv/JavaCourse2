package All_prac.prac_10;

import java.util.Scanner;

public class Ex_17 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println(Max_num(num));
    }

    public static int Max_num(Scanner num) {
        int cur_num = num.nextInt();
        if (cur_num == 0) {
            return 0;
        } else {
            int int_max = Max_num(num);
            return Math.max(int_max, cur_num);
        }
    }
}
