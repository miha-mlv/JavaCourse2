package All_prac.prac_6.Dish;

public abstract class  Dish {
    private String color = "Белый";
    abstract void drink();
    abstract void eat();
    void Get_color()
    {
        System.out.println(color);
    }
    public Dish(){}
}
