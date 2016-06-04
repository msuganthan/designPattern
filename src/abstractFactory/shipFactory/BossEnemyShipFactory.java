package abstractFactory.shipFactory;

import abstractFactory.esengine.ESBossEngine;
import abstractFactory.esengine.ESEngine;
import abstractFactory.esgun.ESBossGun;
import abstractFactory.esgun.ESGun;

public class BossEnemyShipFactory implements EnemyShipFactory{

	public ESGun addGun() {
		// TODO Auto-generated method stub
		return new ESBossGun();
	}

	public ESEngine addEngine() {
		// TODO Auto-generated method stub
		return new ESBossEngine();
	}

}
