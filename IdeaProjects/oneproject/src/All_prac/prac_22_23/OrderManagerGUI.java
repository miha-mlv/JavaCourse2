package All_prac.prac_22_23;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderManagerGUI extends JFrame {
    private OrderManager orderManager;

    public OrderManagerGUI() {
        super("Order Manager GUI");
        orderManager = new OrderManager();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        createUI();
    }

    private void createUI() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JTextArea outputArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(outputArea);
        panel.add(scrollPane, BorderLayout.CENTER);

        JButton addOrderButton = new JButton("Add Order");
        addOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Добавление заказа и вывод результатов в текстовую область
                try {
                    orderManager.addOrder("Address1", new RestaurantOrder());
                    outputArea.append("Order added successfully.\n");
                } catch (OrderAlreadyAddedException ex) {
                    outputArea.append("Error: " + ex.getMessage() + "\n");
                }
            }
        });

        JButton addItemButton = new JButton("Add Item to Order");
        addItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Добавление позиции в заказ и вывод результатов в текстовую область
                try {
                    orderManager.addPositionToOrder("Address1", new Dish(10, "Description", "Dish"));
                    outputArea.append("Item added to order successfully.\n");
                } catch (OrderAlreadyAddedException ex) {
                    outputArea.append("Error: " + ex.getMessage() + "\n");
                }
            }
        });

        panel.add(addOrderButton, BorderLayout.NORTH);
        panel.add(addItemButton, BorderLayout.SOUTH);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new OrderManagerGUI().setVisible(true);
            }
        });
    }
}
