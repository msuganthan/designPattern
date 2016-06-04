package abstractFactory.shipFactory;

import abstractFactory.esengine.ESEngine;
import abstractFactory.esengine.ESGruntEngine;
import abstractFactory.esgun.ESGruntGun;
import abstractFactory.esgun.ESGun;

public class GruntEnemyShipFactory implements EnemyShipFactory{

	public ESGun addGun() {
		// TODO Auto-generated method stub
		return new ESGruntGun();
	}

	public ESEngine addEngine() {
		// TODO Auto-generated method stub
		return new ESGruntEngine();
	}

}
