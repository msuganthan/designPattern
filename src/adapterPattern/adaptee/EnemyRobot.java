package adapterPattern.adaptee;

public class EnemyRobot {
	public void smashWithHands() {
		System.out.println("EnemyRobot smashWithHands");
	}
	
	public void walkForward() {
		System.out.println("EnemyRobot walkForward");
	}
	
	public void reactToHuman(String driverName){
		System.out.println("EnemyRobot reactToHuman");
	}
}
