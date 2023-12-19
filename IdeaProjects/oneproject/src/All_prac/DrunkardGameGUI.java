package All_prac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrunkardGameGUI extends DoubleLinkedList{
    private JFrame frame;
    private DoubleLinkedList<Integer> player1Deck;
    private DoubleLinkedList<Integer> player2Deck;
    private JLabel player1Label;
    private JLabel player2Label;
    private JButton playButton;
    private int rounds;

    public DrunkardGameGUI() {
        frame = new JFrame("Игра 'Пьяница'");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());

        player1Deck = new DoubleLinkedList<>();
        player2Deck = new DoubleLinkedList<>();

        player1Label = new JLabel("Карты игрока 1: ");
        player2Label = new JLabel("Карты игрока 2: ");
        playButton = new JButton("Сыграть раунд");
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playRound();
            }
        });
        frame.add(player1Label, BorderLayout.NORTH);
        frame.add(player2Label, BorderLayout.CENTER);
        frame.add(playButton, BorderLayout.SOUTH);

        initializeDecks();

        frame.setVisible(true);
    }

    private void initializeDecks() {
        //initialize player_1
        String cards_1 = JOptionPane.showInputDialog("Введите карты для игрока 1 (5 чисел от 0 до 9 через пробел):");
        if(cards_1.length() != 9) {
            JOptionPane.showMessageDialog(frame, "Ошибка: Введите 5 чисел через пробел.", "Ошибка", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        else {
            String[] arr_cards = cards_1.split(" ");
            for (String card : arr_cards) {
                int num = Integer.parseInt(card);
                player1Deck.addLast(num);
            }
        }
        //initialize player_2
        String cards_2 = JOptionPane.showInputDialog("Введите карты для игрока 2 (5 чисел от 0 до 9 через пробел):");
        if(cards_2.length() != 9) {
            JOptionPane.showMessageDialog(frame, "Ошибка: Введите 5 чисел через пробел.", "Ошибка", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        else {
            String[] arr_cards = cards_2.split(" ");
            for (String card : arr_cards) {
                int num = Integer.parseInt(card);
                player2Deck.addLast(num);
            }
        }
    }

    private void playRound() {
        int card1 = player1Deck.poll();
        int card2 = player2Deck.poll();

        if (card1 == 0)
        {
            player1Deck.addLast(card1);
            player1Deck.addLast(card2);
            if (player1Deck.isEmpty() || player2Deck.isEmpty()) {
                displayWinner();
                return;
            }
        }
        else if(card2 == 0)
        {
            player2Deck.addLast(card1);
            player2Deck.addLast(card2);
            if (player1Deck.isEmpty() || player2Deck.isEmpty()) {
                displayWinner();
                return;
            }
        }
        else if (card1 > card2) {
            // Игрок 1 выигрывает раунд
            player1Deck.addLast(card1);
            player1Deck.addLast(card2);
            if (player1Deck.isEmpty() || player2Deck.isEmpty()) {
                displayWinner();
                return;
            }
        }
        else {
            // Игрок 2 выигрывает раунд
            player2Deck.addLast(card1);
            player2Deck.addLast(card2);
            if (player1Deck.isEmpty() || player2Deck.isEmpty()) {
                displayWinner();
                return;
            }
        }
        rounds++;
        updateLabels();
    }

    private void updateLabels() {
        player1Label.setText("Карты игрока 1: " + player1Deck.to_String());
        player2Label.setText("Карты игрока 2: " + player2Deck.to_String());
    }

    private void displayWinner() {
        if (player1Deck.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Игрок 2 выиграл после " + rounds + " раундов!");
        } else {
            JOptionPane.showMessageDialog(frame, "Игрок 1 выиграл после " + rounds + " раундов!");
        }
        System.exit(0);
    }

    public static void main(String[] args) {
        new DrunkardGameGUI();
    }
}