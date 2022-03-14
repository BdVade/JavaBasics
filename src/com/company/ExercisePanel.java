package com.company;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class ExercisePanel extends JOptionPane{
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int width_steps =  width/15;
        int height_steps =  height/15;

        int width_coords =  width;
        int height_coords =  height;

        while (height_coords >= 0){
            g.drawLine(0, 0, width_coords, height_coords);
            width_coords -= width_steps;
            height_coords -= height_steps;
        }

    }


}
