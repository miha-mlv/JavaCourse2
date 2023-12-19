package All_prac.two_prac.Ball;

public class testBall {
    public static void main(String[] args) {
    Ball b = new Ball();
    System.out.println(b.toString());
    b.SetX(1.0);
    b.SetXY(2.0,4.0);
    System.out.println(b.toString());
    b.move(1.0,1.0);
    System.out.println(b.toString());
    }
}
