package com.guzichenko.GUI;

import javax.swing.*;
import java.awt.*;

/**
 * @author Guzichenko Artem on 16.10.2016.
 */
public class LabelBuilder {

    public JComponent createComponent(JComponent component, Dimension size, int locX, int locY){
            component.setLocation(locX, locY);
            component.setSize(size);
        return component;
    }
}
