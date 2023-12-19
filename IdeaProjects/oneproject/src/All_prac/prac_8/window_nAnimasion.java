package All_prac.prac_8;

import javax.swing.*;

public class window_nAnimasion {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("The file was not transferred");
            return;
        }
        String imagePath = args[0];//"C:\\Users\\malor\\IdeaProjects\\oneproject\\src\\All_prac\\prac_8

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Red car");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel = new JPanel();
            ImageIcon image = new ImageIcon(imagePath);
            JLabel label = new JLabel(image);
            label.setSize(100,100);
            frame.add(label);
            frame.setSize(300,300);
            frame.setVisible(true);
        });
    }
}