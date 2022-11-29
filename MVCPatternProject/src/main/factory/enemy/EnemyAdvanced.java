package main.factory.enemy;

import main.factory.Shape;

public class EnemyAdvanced implements Shape {
    @Override
    public void draw() {
        System.out.println("Je dessine l'enemie compliqué");
    }
}

