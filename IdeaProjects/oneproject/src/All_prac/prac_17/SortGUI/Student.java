package All_prac.prac_17.SortGUI;

public class Student {
    private String name;
    private String surname;
    private double average_score;
    Student(String surname, String name, double average_score)
    {
        this.name = name;
        this.surname = surname;
        this.average_score = average_score;
    }
    public String getSurname()
    {
        return this.surname;
    }
    public String getName()
    {
        return this.name;
    }
    public Double getAverageScore()
    {
        return this.average_score;
    }
}
