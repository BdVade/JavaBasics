package com.company;
import javax.swing.JFrame;

public class ExercisePanelDisplay {
    public static void main(String[] args){
        ExercisePanel panel = new ExercisePanel();

        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);

    }
}
