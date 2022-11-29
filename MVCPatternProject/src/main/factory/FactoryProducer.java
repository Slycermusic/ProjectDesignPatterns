package main.factory;

import main.factory.AbstractFactory;
import main.factory.enemy.EnemyFactory;
import main.factory.map.MapFactory;
import main.factory.player.PlayerFactory;

public class FactoryProducer {

	private static boolean map;
	private static boolean player;
	private static boolean	enemy;
	public static AbstractFactory getFactory()
   	{
	   	if(map){
		   		return new MapFactory();
	   		}	else if (player) {
		   		return new PlayerFactory();
	   		}	else {
		   		return new EnemyFactory();
	   		}
   	}
}
