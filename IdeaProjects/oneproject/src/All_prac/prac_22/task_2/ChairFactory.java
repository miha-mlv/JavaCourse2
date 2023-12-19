package All_prac.prac_22.task_2;

public class ChairFactory {
    public static Chair getChair(String type, String color)
    {
        if("VictorianChair".equalsIgnoreCase(type))
        {
            return new VictorianChair(color);
        }
        else if("MagicChair".equalsIgnoreCase(type))
        {
            return new MagicChair(color);
        }
        else if("MultifunctionalChair".equalsIgnoreCase(type))
        {
            return new MultifunctionalChair(color);
        }
        else {
            return null;
        }
    }
}
