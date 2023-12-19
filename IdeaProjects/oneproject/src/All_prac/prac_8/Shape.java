package All_prac.prac_8;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

abstract class Shape {
    private Color color;
    private int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }
    public Color getColor()
    {
        return color;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public abstract void draw(Graphics g);
}

class Circle extends Shape {
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX(), getY(), 2 * radius, 2 * radius);
    }
}

class Rectangle extends Shape {
    private int width, height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX(), getY(), width, height);
    }
}

class RandomShapesApp extends JPanel {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public RandomShapesApp() {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int x = random.nextInt(400);
            int y = random.nextInt(400);
            int widthOrRadius = random.nextInt(50) + 10;
            int height = random.nextInt(50) + 10;
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            if (random.nextInt(2)+1 == 1) {
                shapes.add(new Circle(color, x, y, widthOrRadius));
            } else {
                shapes.add(new Rectangle(color, x, y, widthOrRadius, height));
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Random Shapes");
            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            RandomShapesApp app = new RandomShapesApp();
            frame.add(app);
            frame.setVisible(true);
            RandomShapesApp qw = new RandomShapesApp();
        });
    }
}