package All_prac.prac_19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class task_1 {
    public List<?> convert_(String[] line)
    {
        return new ArrayList<>(Arrays.asList(line));
    }

    public static void main(String[] args) {
        String[] line = {"1", "2", "3", "4", "5"};
        task_1 obj = new task_1();
        System.out.println(line);
        System.out.println(obj.convert_(line));
    }
}
