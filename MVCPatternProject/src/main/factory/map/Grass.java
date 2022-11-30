package main.factory.map;

import main.factory.Shape;
import javax.swing.*;
import java.awt.*;

import static java.awt.Color.*;

public class Grass extends JPanel implements Shape {

    public void draw() {
        System.out.println("Test");
        repaint();
    }

    public void paintComponent(Graphics g) {
        Graphics2D graphics2d = (Graphics2D) g;
        graphics2d.setColor(ORANGE);
        graphics2d.fillRect(0, 0, getWidth(), getHeight());

        GradientPaint gradient = new GradientPaint (
                getWidth()/4, getHeight()/4, RED,
                getWidth()*3/4, getHeight()*3/4, ORANGE);

        graphics2d.setPaint(gradient);
        graphics2d.fillOval(getWidth()/4, getHeight()/4, getWidth()/2, getHeight()/2);
        System.out.println("paint worked");
    }

}

