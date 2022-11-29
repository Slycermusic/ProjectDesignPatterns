package main.factory.enemy;

import main.factory.Shape;

public class EnemyHard implements Shape {
    @Override
    public void draw() {
        System.out.println("Je dessine l'enemie hardcore");
    }
}

