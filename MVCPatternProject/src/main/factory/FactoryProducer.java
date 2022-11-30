package main.factory;

import main.factory.enemy.EnemyFactory;
import main.factory.map.MapFactory;
import main.factory.player.PlayerFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(int i)
   	{
		switch (i) {
			case 1:
				return new MapFactory();
			case 2:
				return new PlayerFactory();
			case 3:
				return new EnemyFactory();
			default:
				return null;
		}
   	}
}
