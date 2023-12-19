package All_prac.three_prac.Movable;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int ySpeed;
    protected int xSpeed;
    //MovablePoint(){}
    MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public String toString()
    {
        return "Point: x = "+x+"; y = "+y+"; xSpeed = "+xSpeed+"; ySpeed = "+ySpeed;
    }
    @Override
    public void moveUp()
    {
        System.out.println("Point: UP");
    }
    @Override
    public void moveDown()
    {
        System.out.println("Point: DOWN");
    }
    @Override
    public void moveRight()
    {
        System.out.println("Point: RIGHT");
    }
    @Override
    public void moveLeft()
    {
        System.out.println("Point: LEFT");
    }
}
