package All_prac.three_prac.Movable;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        this.topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        this.bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);

    }
    public void moveUp()
    {
        if(checkS(this.bottomRight.xSpeed,this.bottomRight.ySpeed, this.topLeft.xSpeed, this.topLeft.ySpeed ))
        {
            topLeft.y += topLeft.ySpeed;
            bottomRight.y += bottomRight.ySpeed;
        }
    }
    public void moveDown()
    {
        if(checkS(this.bottomRight.xSpeed,this.bottomRight.ySpeed, this.topLeft.xSpeed, this.topLeft.ySpeed )) {
            topLeft.y -= topLeft.ySpeed;
            bottomRight.y -= bottomRight.ySpeed;
        }
    }
    public void moveRight()
    {
        if(checkS(this.bottomRight.xSpeed,this.bottomRight.ySpeed, this.topLeft.xSpeed, this.topLeft.ySpeed )) {
            topLeft.x += topLeft.xSpeed;
            bottomRight.x += bottomRight.xSpeed;
        }
    }
    public void moveLeft()
    {
        if(checkS(this.bottomRight.xSpeed,this.bottomRight.ySpeed, this.topLeft.xSpeed, this.topLeft.ySpeed )) {
            topLeft.x -= topLeft.xSpeed;
            bottomRight.x -= bottomRight.xSpeed;
        }
    }
    public boolean checkS(int xSpeed1, int ySpeed1, int xSpeed2, int ySpeed2)
    {
        if((xSpeed1 == xSpeed2) || (ySpeed1 == ySpeed2))
        {
            return true;
        }
        return false;
    }
    public String toString()
    {
        return "cord: Lx="+topLeft.x+", Ly="+topLeft.y+"; Bx="+bottomRight.x+", By="+bottomRight.y;
    }
}
