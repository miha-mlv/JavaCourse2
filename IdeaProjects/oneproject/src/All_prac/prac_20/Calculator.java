package All_prac.prac_20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Calculator extends JFrame {
    private JTextField inputField;
    private Stack<Double> stack;


    public Calculator() {
        stack = new Stack<>();
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        inputField = new JTextField();
        inputField.setEditable(false);
        inputField.setText("0.0");
        add(inputField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        add(buttonPanel, BorderLayout.CENTER);

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener(label));
            buttonPanel.add(button);
        }
    }

    private void updateInputField() {
        StringBuilder sb = new StringBuilder();
        for (Double num : stack) {
            sb.append(num).append("  ");
        }
        if(sb.length() == 0)
        {
            inputField.setText("0.0");
        }
        else{
            inputField.setText(sb.toString());
        }
    }

    private class ButtonClickListener implements ActionListener {
        private String label;

        public ButtonClickListener(String label) {
            this.label = label;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (label.matches("[0-9]+")) {
                double number = Double.parseDouble(label);
                stack.push(number);
            } else if (label.equals("+")) {
                if (stack.size() >= 2) {
                    double num2 = stack.pop();
                    double num1 = stack.pop();
                    double result = num1 + num2;
                    stack.push(result);
                }
            } else if (label.equals("-")) {
                if (stack.size() >= 2) {
                    double num2 = stack.pop();
                    double num1 = stack.pop();
                    double result = num1 - num2;
                    stack.push(result);
                }
            } else if (label.equals("*")) {
                if (stack.size() >= 2) {
                    double num2 = stack.pop();
                    double num1 = stack.pop();
                    double result = num1 * num2;
                    stack.push(result);
                }
            } else if (label.equals("/")) {
                if (stack.size() >= 2) {
                    double num2 = stack.pop();
                    double num1 = stack.pop();
                    if (num2 != 0) {
                        double result = num1 / num2;
                        stack.push(result);
                    } else {
                        JOptionPane.showMessageDialog(null,"Error: Division by zero");
                    }
                }
            } else if (label.equals("C")) {
                stack.clear();
                inputField.setText("0.0");
            } else if (label.equals("=")) {
                if (stack.size() == 1) {
                    inputField.setText(Double.toString(stack.pop()));
                    return;
                } else {
                    JOptionPane.showMessageDialog(null,"Error: Invalid expression");
                }
            }
            updateInputField();
        }
    }

    public static void main(String[] args) {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
    }
}