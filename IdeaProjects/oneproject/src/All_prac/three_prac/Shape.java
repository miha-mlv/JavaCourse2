package All_prac.three_prac;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.filled = filled;
        this.color = color;
    }

    public String GetColor() {
        return color;
    }

    public void SetColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void SetFilled(boolean filled) {

        this.filled = filled;
    }
    public abstract double GetArea();
    public abstract double GetPerimeter();
    public String toString()
    {
        return "";
    }

}