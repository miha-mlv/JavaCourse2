package All_prac.prac_15_student;

public class Student{
    private String rollNo;
    private String name;
    Student(){}
    Student(String rollNo, String name)
    {
        this.name = name;
        this.rollNo = rollNo;
    }
    public String getName()
    {
        return name;
    }
    public String getRollNo()
    {
        return rollNo;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setRollNo(String rollNo)
    {
        this.rollNo =  rollNo;
    }
}
