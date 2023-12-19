package All_prac.prac_15_student;

public class StudentController{
    private Student model;
    private StudentView view;
    StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    public void setStudentName(String name)
    {
        model.setName(name);
    }
    public String getStudentName()
    {
        return model.getName();
    }
    public void setStudentRollN(String RollNo)
    {
        model.setRollNo(RollNo);
    }
    public String getStudentRollNo()
    {
        return model.getRollNo();
    }
    public void updateView()
    {
        System.out.println("name: "+this.getStudentName());
        System.out.println("rollNo: "+this.getStudentRollNo());
    }
}
