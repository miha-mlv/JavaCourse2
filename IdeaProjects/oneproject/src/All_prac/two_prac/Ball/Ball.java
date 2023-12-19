package All_prac.two_prac.Ball;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;
    public Ball(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public Ball()
    {
    }
    public double GetX()
    {
        return this.x;
    }
    public double GetY()
    {
        return this.y;
    }
    public void SetX(double x)
    {
       this.x = x;
    }
    public void SetY(double  y)
    {
        this.y = y;
    }
    public void SetXY(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp, double yDisp)
    {
        this.x += xDisp;
        this.y += yDisp;
    }
    public String toString()
    {
        return "Ball: @("+x+","+y+")";
    }
}
