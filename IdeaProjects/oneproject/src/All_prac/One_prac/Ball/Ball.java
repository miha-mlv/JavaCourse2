package All_prac.One_prac.Ball;

public class Ball {
    private int size;
    private String color;
    private String classificator;
    public Ball(int size, String color, String classificator)
    {
        this.size = size;
        this.color = color;
        this.classificator = classificator;
    }
    public Ball(int size, String classificator)
    {
        this.size = size;
        this.color = "black";
        this.classificator = classificator;
    }
    public void ChangeSize(int  size)
    {
        this.size = size;
    }
    public void ChangeColor(String color)
    {
        this.color = color;
    }
    public void ChangeClassificator(String classificator)
    {
        this.classificator = classificator;
    }
    public String GetColor()
    {
        return this.color;
    }
    public String GetClassificator()
    {
        return this.classificator;
    }
    public int GetSize()
    {
        return this.size;
    }
    public String toString()
    {
        return "Ball's: "+this.color+" "+this.classificator+" "+this.size;
    }
}
