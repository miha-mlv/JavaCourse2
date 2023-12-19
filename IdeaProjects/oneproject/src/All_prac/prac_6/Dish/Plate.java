package All_prac.prac_6.Dish;

public class Plate extends Dish{
    private String color;
    public void drink()
    {
        System.out.println("drink: no");
    }
    public void eat()
    {
        System.out.println("eat: Yes");
    }
    @Override
    public void Get_color()
    {
        System.out.println(this.color);
    }
}
