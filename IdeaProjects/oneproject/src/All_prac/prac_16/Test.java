package All_prac.prac_16;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Test obj = new Test();
        Scanner scan = new Scanner(System.in);
        String key;
        key = scan.next();
        obj.printMessage(key);
    }

    public void printMessage(String key) {
        try {
            String message = getKey(key);
            System.out.println(message);
        } catch (Exception e) {
            System.err.println("null key in getDetails");
        }
    }
    public String getKey(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for " + key; }
}
