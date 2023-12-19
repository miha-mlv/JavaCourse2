package All_prac.prac_13;

import java.io.FileReader;
import java.io.IOException;

public class Read {
    public void print_info(String filename) {//выводит файл
        int symbol;
        try (FileReader reader = new FileReader(filename)) {
            while ((symbol = reader.read()) != -1) {
                System.out.print((char) symbol);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println();
    }
}
