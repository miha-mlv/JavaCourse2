package All_prac.prac_15_employe;

public class Employe {
    private String name;
    private int hour;
    private int hwork;
    Employe(String name, int hour, int hwork)
    {
        this.name = name;
        this.hour = hour;
        this.hwork = hwork;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setHour(int hour)
    {
        this.hour = hour;
    }
    public void setHwork(int hWork)
    {
        this.hwork = hWork;
    }
    public String getName()
    {
        return name;
    }
    public int getHour()
    {
        return hour;
    }
    public int getHwork()
    {
        return hwork;
    }
    public void salary()
    {
        System.out.println("Salary "+name+" = "+(hwork*hour));
    }
}
