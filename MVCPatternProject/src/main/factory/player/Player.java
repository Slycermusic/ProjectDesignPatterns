package main.factory.player;

import main.factory.Shape;

public class Player implements Shape {
    @Override
    public void draw() {
        System.out.println("Je dessine un joueur");
    }
}

