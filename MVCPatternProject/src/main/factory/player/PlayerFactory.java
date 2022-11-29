package main.factory.player;

import main.factory.AbstractFactory;
import main.factory.Shape;

public class PlayerFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("PLAYER")){
            return new Player();
        }
        return null;
    }
}
