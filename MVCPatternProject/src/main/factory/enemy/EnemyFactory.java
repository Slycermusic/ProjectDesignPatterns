package main.factory.enemy;

import main.factory.AbstractFactory;
import main.factory.Shape;

public class EnemyFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("BASE")){
            return new EnemyBase();
        } else if(shapeType.equalsIgnoreCase("ADVANCED")){
            return new EnemyAdvanced();
        } else if(shapeType.equalsIgnoreCase("HARD")){
            return new EnemyHard();
        } else if(shapeType.equalsIgnoreCase("BOSS")){
            return new EnemyBoss();
        }
        return null;
    }
}
