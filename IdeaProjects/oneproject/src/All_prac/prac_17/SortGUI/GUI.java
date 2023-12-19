package All_prac.prac_17.SortGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;

public class GUI {
    public LinkedList<Student> arr_student = new LinkedList<>();
    public JFrame Fwindow = new JFrame("app");
    public JButton Bshow_arr_student = new JButton("Показать список студентов");
    public JButton Bsort_arr_student = new JButton("Сортировать список студентов");
    public JButton Badd_arr_student = new JButton("Добавить студента в список");
    public JButton Bfound_arr_student = new JButton("Найти студента");
    public void start_app()
    {
        Fwindow.setSize(400,400);
        Fwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Fwindow.setLayout(new GridLayout());
        Badd_arr_student.setSize(35,50);
        Bshow_arr_student.setSize(20,10);
        Bshow_arr_student.setLocation(20,10);
        Bshow_arr_student.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                print_arr_student();
            }
        });
        Badd_arr_student.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Add_Student();
            }
        });
        Bsort_arr_student.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sort_arr();
                print_arr_student();
            }
        });
        Bfound_arr_student.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String student_info;
                student_info = JOptionPane.showInputDialog("Введите ФИ студента");
                String[] _student = new String[1];
                try {
                    _student = student_info.split(" ");
                }catch(NullPointerException ex)
                {
                    return;
                }
                try {
                    found_student(_student[0], _student[1]);
                } catch (StudentNotFoundExeption ex) {
                    JOptionPane.showMessageDialog(null,"Ошибка: "+ex.getMessage());
                }catch (ArrayIndexOutOfBoundsException e1)
                {
                    JOptionPane.showMessageDialog(null,"Введите корректные данные");
                }
            }
        });
        Fwindow.add(Badd_arr_student);//, BorderLayout.NORTH);
        Fwindow.add(Bshow_arr_student);//, BorderLayout.CENTER);
        Fwindow.add(Bsort_arr_student, BorderLayout.SOUTH);
        Fwindow.add(Bfound_arr_student, BorderLayout.EAST);
        Fwindow.setVisible(true);
    }
    public void Add_Student()
    {
        try {
            String InputDate = JOptionPane.showInputDialog(Fwindow, "Введите ФИ и средний балл студента через пробел: ");
            String[] splitSt;
            try {
                splitSt = InputDate.split(" ");
            }catch (NullPointerException ex)
            {
                return;
            }
            try {
                arr_student.add(new Student(splitSt[0], splitSt[1], Double.parseDouble(splitSt[2])));
            }catch(ArrayIndexOutOfBoundsException e1)
            {
                JOptionPane.showMessageDialog(null, "Введите корректные данные");
            }
        }catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,e + "Введите корректные данные");
        }
    }
    public void print_arr_student()
    {
        if(arr_student.isEmpty())
        {
            JOptionPane.showMessageDialog(Fwindow, "Список пуст!");
            return;
        }
        String line_print = "";
        int i = 1;
        for (Student student : arr_student) {
            line_print += i + ") " + student.getSurname() + " " + student.getName() + " " + student.getAverageScore() + "\n";
            i++;
        }
        JOptionPane.showMessageDialog(Fwindow, line_print);
    }
    public void sort_arr()
    {
        for(int i = 0; i < arr_student.size(); i++)
        {
            for(int j = i; j < arr_student.size(); j++)
            {
                if(arr_student.get(i).getAverageScore() < arr_student.get(j).getAverageScore())
                {
                    Collections.swap(arr_student, i,j);
                }
            }
        }
    }
    public void found_student(String name, String surname) throws StudentNotFoundExeption {
        for(Student student:arr_student)
        {
            if(Objects.equals(student.getSurname(), surname) || Objects.equals(student.getName(), name))
            {
                String line = "Студент найден...\n";
                line += "Студент: " + student.getSurname() + " " + student.getName() + " " + student.getAverageScore();
                JOptionPane.showMessageDialog(Fwindow,line);
                return;
            }
        }
        throw new StudentNotFoundExeption("Студент " + surname + " " + name + " не найден");
    }



}
