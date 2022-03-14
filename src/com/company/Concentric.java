package com.company;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Concentric extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for (int i=0; i<=100; i += 10 ){
            g.drawOval(100-i-30, 100-i-30, i, i );
        }



    }
    public static void main (String[] args){
        Concentric panel = new Concentric();
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}

// basically failed at making this output concentric Circles. Might come back to it.
