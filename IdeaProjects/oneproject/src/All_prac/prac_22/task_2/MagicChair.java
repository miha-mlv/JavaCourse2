package All_prac.prac_22.task_2;

public class MagicChair implements Chair{
    private String color;
    MagicChair(String color)
    {
        this.color = color;
    }
    @Override
    public String getColor()
    {
        return "MagicChair: " + color;
    }
}
