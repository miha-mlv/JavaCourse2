package All_prac.three_prac.Movable;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }
    @Override
    public void moveUp()
    {
        System.out.println("circle: UP"+'\n');
    }
    @Override
    public void moveDown()
    {
        System.out.println("circle: DOWN"+'\n');
    }
    @Override
    public void moveRight()
    {
        System.out.println("circle: RIGHT"+'\n');
    }
    @Override
    public void moveLeft()
    {
        System.out.println("circle: LEFT"+'\n');
    }
}
