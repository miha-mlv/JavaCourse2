package All_prac.prac_17.SortGUI;

public class StudentNotFoundExeption extends Exception{
    public StudentNotFoundExeption(){
        super("Студент не найден");
    };
    public StudentNotFoundExeption(String msg)
    {
        super(msg);//JOptionPane.showMessageDialog(null, "msg");
    }

}
