package com.guzichenko.GUI.panels;

import com.guzichenko.GUI.LabelBuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Guzichenko Artem on 16.10.2016.
 */
public class MainPanel {

    private JPanel panel;

    public MainPanel() {
        panel = new JPanel();
        panel.setLayout(null);

        JLabel firstName = new JLabel("First name");
        JLabel secondName = new JLabel("Second name");
        JLabel phoneNumber = new JLabel("Phone number");
        JLabel email = new JLabel("e-mail");

        LabelBuilder cb = new LabelBuilder();
        panel.add(cb.createComponent(firstName, new Dimension(100, 20), 20, 20));
        panel.add(cb.createComponent(new JTextField(), new Dimension(150, 20), 20, 40));
        panel.add(cb.createComponent(secondName, new Dimension(100, 20), 200, 20));
        panel.add(cb.createComponent(new JTextField(), new Dimension(150, 20), 200, 40));
        panel.add(cb.createComponent(phoneNumber, new Dimension(100, 20), 20, 60));
        panel.add(cb.createComponent(new JTextField(), new Dimension(150, 20), 20, 80));
        panel.add(cb.createComponent(email, new Dimension(100, 20), 200, 60));


        JButton button = new JButton("Add contact");
        button.setSize(120, 25);
        button.setLocation(20, 300);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        panel.add(button);

    }

    public JPanel getPanel() {
        return panel;
    }
}
