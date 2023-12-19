package All_prac.three_prac;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle()
    {
    }
    public Rectangle(double width, double length)
    {
        this.length = length;
        this.width = width;
    }
    public Rectangle(double width, double length, String color, boolean filled)
    {
        this.color = color;
        this.width = width;
        this.length = length;
        this.filled = filled;
    }
    public double GetWidth()
    {

        return this.width;
    }
    public double GetLength()
    {
        return this.length;
    }
    public void SetLength(double length)
    {
        this.length = length;
    }
    public void SetWidth(double width)
    {
        this.width = width;
    }
    @Override
    public double GetArea()
    {
        return this.length*this.width;
    }
    @Override
    public double GetPerimeter()
    {
        return (this.width*2)+(this.length*2);
    }
    @Override
    public String toString()
    {

        return "Shape: rectangle, width: "+this.width+", length: "+this.length+", color: "+this.color;
    }
}
