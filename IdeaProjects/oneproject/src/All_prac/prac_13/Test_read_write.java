package All_prac.prac_13;

public class Test_read_write extends Write{
    public static void main(String[] args) {
        String filename = new String("C:\\Users\\malor\\IdeaProjects\\oneproject\\src\\All_prac\\prac_13\\file.txt");
        Write wr = new Write();
        Read rd = new Read();
        wr.input_info(filename);
        rd.print_info(filename);
        wr.change_info(filename);
        rd.print_info(filename);
        wr.input_last(filename);
        rd.print_info(filename);


    }
}
