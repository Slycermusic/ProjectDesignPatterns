package main.factory.map;

import main.factory.AbstractFactory;
import main.factory.Shape;

public class MapFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("WALL")){
            return new Wall();
        }else if(shapeType.equalsIgnoreCase("GRASS")){
            return new Grass();
        }else if(shapeType.equalsIgnoreCase("PATH")){
            return new Path();
        }
        return null;
    }
}
