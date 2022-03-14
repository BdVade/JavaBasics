package com.company;
import javax.swing.JOptionPane;
import java.awt.Graphics;

public class DrawPanel extends JOptionPane{
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        g.drawLine(0,0, width, height);
        g.drawLine(0, height, width, 0);
    }

}
