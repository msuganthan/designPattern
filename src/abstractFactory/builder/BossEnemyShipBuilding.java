package abstractFactory.builder;

import abstractFactory.esengine.ESBossEngine;
import abstractFactory.esgun.ESBossGun;

public class BossEnemyShipBuilding extends EnemyShipBuilding{

	public void buildEnemyShip() {
		// TODO Auto-generated method stub
		new ESBossEngine().toString();
		new ESBossGun().toString();
	}

}
