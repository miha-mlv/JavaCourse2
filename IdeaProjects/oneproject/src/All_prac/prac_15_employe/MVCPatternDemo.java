package All_prac.prac_15_employe;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Employe model = new Employe("name", 12, 12);
        EmployeView view = new EmployeView();
        EmployeController controller = new EmployeController(model, view);
        controller.updateView();
        System.out.println();
        model.setHour(15);
        controller.updateView();
    }
}
