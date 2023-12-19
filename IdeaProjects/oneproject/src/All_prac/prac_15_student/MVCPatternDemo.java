package All_prac.prac_15_student;

public class MVCPatternDemo{
    public static void main(String[] args) {
        Student model = new Student("123", "misha");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("MISHA");
        System.out.println();
        controller.updateView();

    }
    public Student retriveStudentFromDatabase(String name, String rollNo)
    {
        return null;
    }
}
