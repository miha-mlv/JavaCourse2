package All_prac.prac_22.task_2;

public class MultifunctionalChair implements Chair {
    private String color;
    MultifunctionalChair(String color)
    {
        this.color = color;
    }
    @Override
    public String getColor()
    {
        return "MultifunctionalChair: " + color;
    }
}
