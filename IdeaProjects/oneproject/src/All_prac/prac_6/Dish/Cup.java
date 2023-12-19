package All_prac.prac_6.Dish;

public class Cup extends Dish{
    private String color;
    public void drink()
    {
        System.out.println("drink: Yes");
    }
    public void eat()
    {
        System.out.println("eat: No");
    }
    @Override
    public void Get_color()
    {
        System.out.println(color);
    }
}
