package abstractFactory.test;

import abstractFactory.builder.BossEnemyShipBuilding;
import abstractFactory.builder.EnemyShipBuilding;
import abstractFactory.builder.GruntEnemyShipBuilding;

public class EnemyShipTesting {

	public static void main(String[] args) {
//		EnemyShipFactory enemyShipFactory = new GruntEnemyShipFactory();
//		enemyShipFactory.addEngine(); this class is not responsible for this
		EnemyShipBuilding enemyShipBuilding = new BossEnemyShipBuilding();
		enemyShipBuilding.buildEnemyShip();
		
		EnemyShipBuilding gruntShipBuilding = new GruntEnemyShipBuilding();
		gruntShipBuilding.buildEnemyShip();

	}

}
