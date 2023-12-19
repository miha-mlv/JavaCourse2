package All_prac.last_prac;

public final class Drink implements Item{
    private int price;
    private String name;
    private String other;
    Drink(int price, String name, String other)
    {
        this.name = name;
        this.price = price;
        this.other = other;
    }
    Drink(String name, String other)
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
