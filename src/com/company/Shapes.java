package com.company;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Shapes extends JPanel{
    public void paintComponent(Graphics g){
//        always call super.paintComponent when overriding paintComponent
        super.paintComponent(g);

        for (int i=0; i<10; i++) {
            g.drawRect(10+i*10, 10 + i * 10, 50+i*10, 50 + i * 10);
            g.drawOval(240+i*10, 10 + i * 10, 50+i*10, 50 + i * 10);
        }

    }

    public static void main(String[] args){

        Shapes panel = new Shapes();
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);

    }

}


