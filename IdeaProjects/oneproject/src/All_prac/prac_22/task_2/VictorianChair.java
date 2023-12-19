package All_prac.prac_22.task_2;

public class VictorianChair implements Chair{
    private String color;
    VictorianChair(String color)
    {
        this.color = color;
    }
    @Override
    public String getColor()
    {
        return "VictorianChair color: "+color;
    }
}
