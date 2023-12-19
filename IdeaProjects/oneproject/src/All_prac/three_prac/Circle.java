package All_prac.three_prac;

public class Circle extends Shape{
    private double radius;
    public Circle()
    {
        //---------------------------------//
    }
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double GetRadius()
    {
        return radius;
    }
    public void SetRadius(double radius)
    {

        this.radius = radius;
    }
    @Override
    public double GetArea()
    {
        return Math.PI*radius*radius;
    }
    @Override
    public double GetPerimeter()
    {
        return 2*Math.PI*radius;
    }
    @Override
    public String toString()
    {
        return "Shape: circle, radius: "+this.radius+", color: "+this.color;
    }
}
