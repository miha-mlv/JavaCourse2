package All_prac.prac_6.Dog;

public class zxc extends Dog{
    private String color;
    private String wool;
    private String size = "big";
    public void bite()
    {
        System.out.println("bite: Yes");
    }
    zxc(String wool, String color)
    {
        this.color = color;
        this.wool = wool;
    }
}
