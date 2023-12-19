package All_prac.prac_15_employe;

public class EmployeController {
    private Employe model;
    private EmployeView view;
    EmployeController(Employe model, EmployeView view)
    {
        this.model = model;
        this.view = view;
    }
    public void setEmployeName(String name)
    {
        model.setName(name);
    }
    void updateView()
    {
        view.printemploye(model.getName(),model.getHour(), model.getHwork());
    }
}
