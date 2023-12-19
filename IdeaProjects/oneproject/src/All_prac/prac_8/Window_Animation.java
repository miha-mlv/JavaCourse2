package All_prac.prac_8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Window_Animation {
    private JFrame frame;
    private JPanel animationPanel;
    private Timer timer;
    private BufferedImage[] frames;
    private int currentFrameIndex = 0;

    public Window_Animation() {
        frames = loadFrames();

        // Создание окна
        frame = new JFrame("City");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Создание панели для отображения анимации
        animationPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawCurrentFrame(g);
            }
        };
        frame.add(animationPanel);

        // Создание таймера для анимации
        int frameRate = 1500; // скорость анимации в миллисекундах между кадрами
        timer = new Timer(frameRate, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nextFrame();
                animationPanel.repaint();
            }
        });

        // Начать анимацию
        timer.start();
        frame.setVisible(true);
    }

    // Загрузка кадров анимации из изображений
    private BufferedImage[] loadFrames() {
        BufferedImage[] frames = new BufferedImage[3]; // здесь 4 кадра анимации

        try {
            for (int i = 0; i < 3; i++) {
                String imagePath = "C:/Users/malor/IdeaProjects/oneproject/src/All_prac/prac_8/frame" + i+".jpg";
                File file = new File(imagePath);
                frames[i] = ImageIO.read(file);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return frames;
    }

    // Отрисовка текущего кадра анимации
    private void drawCurrentFrame(Graphics g) {
        BufferedImage currentFrame = frames[currentFrameIndex];
        g.drawImage(currentFrame, 0, 0, null);
    }

    // Переключение на следующий кадр
    private void nextFrame() {
        currentFrameIndex = (currentFrameIndex + 1) % frames.length;
    }

    public static void main(String[] args) {
        new Window_Animation();
    }
}