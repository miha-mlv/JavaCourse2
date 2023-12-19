package All_prac.One_prac.Ball;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(5,"red","football");
        Ball b2 = new Ball(4,"gray","football");
        Ball b3 = new Ball(6,"green","basketball");
        b3.ChangeClassificator("football");
        String text;
        text = b1.toString(); System.out.println(text);
        text = b2.toString(); System.out.println(text);
        text = b3.toString(); System.out.println(text);
    }
}
