package abstractFactory.builder;

import abstractFactory.esengine.ESGruntEngine;
import abstractFactory.esgun.ESGruntGun;

public class GruntEnemyShipBuilding extends EnemyShipBuilding{

	public void buildEnemyShip() {
		// TODO Auto-generated method stub
		new ESGruntEngine().toString();
		new ESGruntGun().toString();
	}

}
