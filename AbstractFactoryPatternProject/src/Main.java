public class Main {
	public static void main(String[] args) {
	      //get shape factory
	      AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
	      
	      //get an object of map.Shape Rectangle
	      Shape shape1 = shapeFactory.getShape("RECTANGLE");
	      
	      //call draw method of map.Shape Rectangle
	      shape1.draw();
	      
	      //get an object of map.Shape Square
	      Shape shape2 = shapeFactory.getShape("SQUARE");
	      
	      //call draw method of map.Shape Square
	      shape2.draw();
	      
	      //get shape factory
	      AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
	      
	      //get an object of map.Shape Rectangle
	      Shape shape3 = shapeFactory1.getShape("RECTANGLE");
	      
	      //call draw method of map.Shape Rectangle
	      shape3.draw();
	      
	      //get an object of map.Shape Square
	      
	      Shape shape4 = shapeFactory1.getShape("SQUARE");
	      //call draw method of map.Shape Square
	      shape4.draw();
	}
}
