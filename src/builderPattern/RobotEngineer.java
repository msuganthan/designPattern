package builderPattern;

public class RobotEngineer {
	private RobotBuilder robotBuilder;
	
	public RobotEngineer(RobotBuilder builder){
		this.robotBuilder = builder;
	}
	
	public Robot getRobot() {
		return this.robotBuilder.getRobot();
	}
	
	public void makeRobot() {
		this.robotBuilder.buildRobotHead();
		this.robotBuilder.buildRobotTorso();
		this.robotBuilder.buildRobotArms();
		this.robotBuilder.buildRobotLegs();
	}
}
