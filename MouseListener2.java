package ru.geekbrains;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class MouseListener2 implements MouseListener {
    private Color color;
    private JTextArea jTextArea;

    public MouseListener2(Color color, JTextArea jTextArea) {
        this.color = color;
        this.jTextArea = jTextArea;
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        jTextArea.setBackground(color);
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
