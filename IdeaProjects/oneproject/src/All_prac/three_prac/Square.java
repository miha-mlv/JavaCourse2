package All_prac.three_prac;

public class Square extends Rectangle{
    protected double side;
    public Square()
    {
    }
    public Square(double side)
    {
        this.side = side;
    }
    public Square(double side, String color, boolean filled)
    {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    public double GetSide()
    {
        return this.side;
    }
    public void SetSide(double side)
    {
        this.side = side;
    }
    public void SetWigth(double side)
    {
        this.width = side;
    }
    public void SetLength(double side)
    {
        this.length = side;
    }
    @Override
    public String toString()
    {
        return "";
    }
}
