package main.factory.map;

import main.factory.Shape;

public class Path implements Shape {
    @Override
    public void draw() {
        System.out.println("Je dessine un chemin sa mère");
    }
}

