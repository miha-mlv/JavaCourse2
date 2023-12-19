package All_prac.three_prac;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.GetArea()); // which version?
        System.out.println(s1.GetPerimeter()); // which version?
        System.out.println(s1.GetColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.GetRadius());

        Circle c1 = (Circle)s1; // downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.GetArea());
        System.out.println(c1.GetPerimeter());
        System.out.println(c1.GetColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.GetRadius());
        //Shape s2 = new Shape();

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // upcast
        System.out.println(s3);
        System.out.println(s3.GetArea());
        System.out.println(s3.GetPerimeter());
        System.out.println(s3.GetColor());
        //System.out.println(s3.GetLength());

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.GetArea());
        System.out.println(r1.GetColor());
        System.out.println(r1.GetLength());

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.GetArea());
        System.out.println(s4.GetColor());
        //System.out.println(s4.GetSide());

// Take note that we downcast Shape s4 to Rectangle, which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.GetArea());
        System.out.println(r2.GetColor());
        //System.out.println(r2.GetSide());
        System.out.println(r2.GetLength());
// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.GetArea());
        System.out.println(sq1.GetColor());
        System.out.println(sq1.GetSide());
        System.out.println(sq1.GetLength());
        /*JFrame frame = null; frame = new JFrame ();//frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE));
        // Создаем первую подпанель
        JPanel subPanel1 = new JPanel();
        subPanel1.setPreferredSize (new Dimension(150, 100));
        subPanel1.setBackground (Color.green);
        JLabel label1 = new JLabel ("One");
        subPanel1.add (label1);



        //Создаем вторую подпанель
        JPanel subPanel2 = new JPanel();
        subPanel2.setPreferredSize (new Dimension(150, 100));
        subPanel2.setBackground (Color.LIGHT_GRAY); JLabel label2
                = new JLabel ("Two");
        subPanel2.add (label2);
        //Добавляем primary панель
        JPanel primary = new JPanel();
        primary.setBackground (Color.blue);
        primary.add (subPanel1);
        primary.add (subPanel2);
        frame.getContentPane().add(primary);
        frame.pack();
        frame.setVisible(true);*/
        /*MovableRectangle m = new MovableRectangle(0,3,3,0,1,1);
        System.out.println(m.toString());
        m.moveDown();
        System.out.println(m.toString());*/

    }
}
