package main.factory.map;

import main.factory.Shape;

public class Wall implements Shape {
    @Override
    public void draw() {
        System.out.println("Je dessine un mur sa mère");
    }
}

