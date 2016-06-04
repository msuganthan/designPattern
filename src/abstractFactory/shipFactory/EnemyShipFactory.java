package abstractFactory.shipFactory;

import abstractFactory.esengine.ESEngine;
import abstractFactory.esgun.ESGun;

public interface EnemyShipFactory {
	ESGun addGun();
	ESEngine addEngine();
}
