package All_prac.last_prac;


public final class Dish implements Item {
    private final int price;
    private final String name;
    private final String other;
    Dish(int price, String name, String other)
    {
        this.name = name;
        this.price = price;
        this.other = other;
    }
    Dish(String name, String other)
    {
        this.name = name;
        this.price = 0;
        this.other = other;
    }
    public final int getPrice()
    {
        return this.price;
    }
    public final String getName()
    {
        return this.name;
    }
    public final String getOther()
    {
        return this.other;
    }
}
