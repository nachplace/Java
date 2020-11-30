package ru.geekbrains;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphInterface extends JFrame {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Окно");
        jFrame.setBounds(300, 300, 400, 400);
        jFrame.setLayout(new BorderLayout());
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();
        jFrame.add(jPanel, BorderLayout.CENTER);

        JMenuBar jMenuBar = new JMenuBar();
        jFrame.add(jMenuBar, BorderLayout.NORTH);
        JMenu jMenu1 = new JMenu("Цвет");
        jMenuBar.add(jMenu1);

        JMenuItem green = jMenu1.add(new StyledEditorKit.ForegroundAction("Зеленый", Color.GREEN));
        JMenuItem yellow = jMenu1.add(new StyledEditorKit.ForegroundAction("Жёлтый", Color.YELLOW));
        JMenuItem cyan = jMenu1.add(new StyledEditorKit.ForegroundAction("Циан", Color.CYAN));

        JButton[] buttons = new JButton[3];
        for (int i = 0; i < 3; i++) {
            buttons[i] = new JButton("Кнопка " + (i+1));
            buttons[i].setBackground(Color.gray);
            jMenuBar.add(buttons[i], BorderLayout.NORTH);
        }

        JTextArea jTextArea = new JTextArea();
        jTextArea.setBackground(Color.GRAY);
        jTextArea.setLineWrap(true);
        jFrame.add(jTextArea, BorderLayout.CENTER);

        JTextField jField = new JTextField();
        jField.setBackground(Color.gray);
        jFrame.add(jField, BorderLayout.SOUTH);
        jField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Your message: " + jField.getText());
                jTextArea.append(e.getActionCommand() + "\n");
                jField.setText("");
            }
        });

        green.addMouseListener(new MouseListener2(Color.GREEN, jTextArea));
        yellow.addMouseListener(new MouseListener2(Color.YELLOW, jTextArea));
        cyan.addMouseListener(new MouseListener2(Color.CYAN, jTextArea));

        buttons[0].addMouseListener(new MouseListener3(Color.magenta, jField));
        buttons[1].addMouseListener(new MouseListener3(Color.RED, jField));
        buttons[2].addMouseListener(new MouseListener3(Color.PINK, jField));

        jFrame.setVisible(true);
    }
}
