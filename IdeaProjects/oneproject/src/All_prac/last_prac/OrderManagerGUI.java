package All_prac.last_prac;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderManagerGUI {
    private JFrame frame;
    private OrderManager orderManager;
    int i = 0;
    Drink water = new Drink(100, "bonAqua", "other");
    Dish chiken = new Dish(250, "Chiken", "other");


    public OrderManagerGUI() {
        orderManager = new OrderManager();
        frame = new JFrame("Restaurant Order Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        JButton addButton = new JButton("Add Order");
        JButton allOrder = new JButton("All Order");
        JButton delOrder = new JButton("Delete Order");
        delOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numberTable = Integer.parseInt(JOptionPane.showInputDialog("номер заказа: "));
                numberTable--;
                try {
                    orderManager.removeOrder(numberTable);
                }catch (IllegalTableNumber ex)
                {
                    new IllegalTableNumber("Error");
                }
            }
        });
        allOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String all = new String(" ");
                int numberOrder = 1;
                for(int j =0; j < i; j++)
                {
                    int size;
                    Order obj = orderManager.getOrder(j);
                    try {
                        size = obj.getOrderSize();
                    }catch (NullPointerException ex)
                    {
                        JOptionPane.showMessageDialog(null,"Пусто");
                        break;
                    }
                    Item[] items = obj.getItems();
                    all = all + numberOrder + ") ";
                    numberOrder++;
                    for(int k = 0; k<size; k++)
                    {
                        all = all + items[k].getName();
                        all = all + " ";
                    }
                    all = all + '\n';

                }
                JOptionPane.showMessageDialog(null, all);
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Order order = new RestaurantOrder();
                JFrame orderFrame;
                orderFrame = new JFrame("Order");
                orderFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                orderFrame.setSize(200,150);
                orderFrame.setLayout(new FlowLayout());
                JButton DishOB = new JButton("Dish");
                JButton DrinkOB = new JButton("Drink");
                JButton Ok = new JButton("Ok");
                orderFrame.add(DishOB);
                orderFrame.add(DrinkOB);
                orderFrame.add(Ok);
                orderFrame.setVisible(true);
                Ok.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        orderManager.addOrder(i,order);
                        i++;
                        orderFrame.dispose();
                    }
                });
                DishOB.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        order.add(chiken);
                    }
                });
                DrinkOB.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        order.add(water);
                    }
                });
                // Здесь обработайте событие и добавьте заказ
                // Пример: orderManager.addOrder(tableNumber, order);
            }
        });

        frame.add(addButton);
        frame.add(allOrder);
        frame.add(delOrder);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        OrderManagerGUI gui = new OrderManagerGUI();
    }
}