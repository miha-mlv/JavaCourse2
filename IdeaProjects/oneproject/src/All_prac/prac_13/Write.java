package All_prac.prac_13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Write
{
    public void input_info(String filename) {//записывает строку в файл
        Scanner input = new Scanner(System.in);
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(input.next());
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    public void change_info(String filename)//заменяет ифнормацию в файле на новую
    {
        Scanner input = new Scanner(System.in);
        try(FileWriter writer = new FileWriter(filename, false))
        {
            writer.write(input.next());
        }catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    public void input_last(String filename)//добавляет строку в конец файла
    {
        Scanner scan = new Scanner(System.in);
        try(FileWriter writer = new FileWriter(filename, true))
        {
            writer.write('\n');
            writer.write(scan.next());
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
