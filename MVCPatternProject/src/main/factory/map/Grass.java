package main.factory.map;

import main.factory.Shape;

public class Grass implements Shape {
    @Override
    public void draw() {
        System.out.println("Je dessine de l'herbe sa mère");
    }
}

