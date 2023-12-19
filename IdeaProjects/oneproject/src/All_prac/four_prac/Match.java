package All_prac.four_prac;

import javax.swing.*;

public class Match extends JFrame {
    JFrame window = new JFrame("match");
    JPanel panel = new JPanel();
    JButton milan_but = new JButton("AC Milan");
    JButton real_but = new JButton("Real Madrid");
    JLabel last_score_label = new JLabel("Last score: None");
    JLabel result_label = new JLabel("Result: " + "0" + " x " + "0");
    JLabel winner_label = new JLabel("Winner: None");
    private int MILAN = 0;
    private int REAL = 0;
    Match()
    {
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500,500);
        window.getContentPane().setLayout(null);//чтобы не растягивались элементы

        setContentPane(panel);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

//        ActionListener listener2 = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                REAL+=1;
//                GOAL("Real Madrid");
//            }
//        };
//        ActionListener listener1 = new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                MILAN+=1;
//                GOAL("AC Milan");
//
//            }
//        };
        milan_but.addActionListener(e -> {
            MILAN++;
            GOAL("AC MILAN");
        });
        real_but.addActionListener(e -> {
            REAL++;
            GOAL("Real Madrid");
        });

        milan_but.setSize(125,50);
        milan_but.setLocation(70,100);
        real_but.setSize(125,50);
        real_but.setLocation(315,90);

        panel.add(milan_but);
        panel.add(real_but);
        panel.add(last_score_label);
        panel.add(winner_label);
        panel.add(result_label);

        window.add(panel);
        window.setVisible(true);
    }
    private  void GOAL(String TM)
    {
        last_score_label.setText("Last score: " + TM);
        result_label.setText("Result" + MILAN + " x " + REAL);
        if(MILAN < REAL)
        {
            winner_label.setText("Winner: " + "Real Madrid");
        } else if (MILAN > REAL) {
            winner_label.setText("Winner: " + "AC Milan");
        }
        else{
            winner_label.setText("Winner: " + "Draw");
        }
    }
}