package com.guzichenko;

import com.guzichenko.GUI.frames.MainGUI;

import javax.swing.*;

/**
 * @author Guzichenko Artem on 16.10.2016.
 */
public class AppRunner {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainGUI("Contact Book");
            }
        });
    }
}
