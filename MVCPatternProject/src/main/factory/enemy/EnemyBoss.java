package main.factory.enemy;

import main.factory.Shape;

public class EnemyBoss implements Shape {
    @Override
    public void draw() {
        System.out.println("Je dessine le boss");
    }
}

