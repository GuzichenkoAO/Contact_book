package com.guzichenko.GUI.frames;

import com.guzichenko.GUI.panels.MainPanel;

import javax.swing.JFrame;

/**
 * @author Guzichenko Artem on 16.10.2016.
 */
public class MainGUI {

    private JFrame frame;
    private MainPanel panel;

    public MainGUI(String name) {

        frame = new JFrame(name);
        panel = new MainPanel();

        frame.setSize(700, 500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setContentPane(panel.getPanel());

        frame.setVisible(true);
    }
}
