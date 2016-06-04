package adapterPattern.adapter;

import adapterPattern.EnemyAttacker;
import adapterPattern.adaptee.EnemyRobot;

public class EnemyRobotAdapter implements EnemyAttacker{

	EnemyRobot enemyRobot;
	
	public EnemyRobotAdapter(EnemyRobot enemyRobot) {
		this.enemyRobot = enemyRobot;
	}
	
	public void fireWeapon() {
		// TODO Auto-generated method stub
		enemyRobot.smashWithHands();
	}

	public void driveForward() {
		// TODO Auto-generated method stub
		enemyRobot.walkForward();
	}

	public void assignDriver(String driverName) {
		// TODO Auto-generated method stub
		enemyRobot.reactToHuman(driverName);
	}

}
