package All_prac.two_prac.new_2_prac;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class arr {
    private int[] mass = new int[10];

    public arr() {
        for (int i = 0; i < 10; i++) {
            mass[i] = i;
        }
    }

    public void task_1() {
        int summ = 0;
        for (int i = 0; i < 10; i++) {
            summ += mass[i];
        }
        System.out.println("for: summ = " + summ);
        summ = 0;
        int i = 0;
        do {
            summ += mass[i];
            i++;
        } while (i != 10);
        System.out.println("do-while: summ = " + summ);
        summ = 0;
        i = 0;
        while (i != 10) {
            summ += mass[i];
            i++;
        }
        System.out.println("while: summ = " + summ);
        summ = 0;
        i = 0;
    }
    public void garmon(int n)
    {
        DecimalFormat df = new DecimalFormat("#.0000");
        float q = 0;
        while(n > 0)
        {
            q = q + (float)1/n;n--;
            System.out.println(q);
        }
    }
    Random rand = new Random();
    public void random_arr_sort()
    {
        System.out.print("mass: ");
        for(int i = 0; i < 10; i++)
        {
            mass[i] = rand.nextInt(100);
            System.out.print(mass[i]+" ");
        }
        Arrays.sort(mass);
        System.out.print("\nSort_mass: ");
        for(int i = 0; i < 10; i++)
        {
            System.out.print(+ mass[i]+" ");
        }
    }
    public void fact(int n)
    {
        int rez = 1;
        while(n!=0)
        {
            rez *= n;
            n--;
        }
        System.out.println("factorial: "+rez);
    }

}
