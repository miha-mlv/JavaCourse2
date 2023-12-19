package All_prac.prac_17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class INN {
    public static boolean checkINN(int inn)
    {
        String line = new String(Integer.toString(inn));
        if(line.length() == 10)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws NoINN {
        Scanner scan = new Scanner(System.in);
        int inn = 0;
        try {
            System.out.print("Введите inn: ");
            inn = scan.nextInt();
        }
        catch (InputMismatchException e)
        {
            System.out.println("error...");
            System.exit(1);
        }
        //catch ()

        try {
            if(!checkINN(inn))
            {
                throw new NoINN("inn: "+inn+"(False)");
            }
            System.out.println("inn: " + inn+"(Ok)");
        }
        catch (NoINN e)
        {
            System.out.println(e.getMessage());
        }

    }
}
class NoINN extends Exception
{
    public NoINN(String errorMsg){
        super(errorMsg);
    }
}