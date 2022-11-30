import main.factory.AbstractFactory;
import main.factory.FactoryProducer;
import main.factory.Shape;

import java.awt.*;

public class Main {
	public static void main(String args[]) {
		PlayerModel playerModel = new PlayerModel(6, 8, 4);
		MainController playerController = new MainController(playerModel);
		playerController.displayViews();


	}
}