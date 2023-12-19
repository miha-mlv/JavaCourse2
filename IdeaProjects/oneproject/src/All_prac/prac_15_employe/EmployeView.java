package All_prac.prac_15_employe;

public class EmployeView {
    public void printemploye(String name, int hour, int hWork)
    {
        System.out.println("name: "+name);
        System.out.println("hour: "+hour);
        System.out.println("hWork: "+hWork);
        System.out.println("salary: "+(hWork*hour));
    }
}
