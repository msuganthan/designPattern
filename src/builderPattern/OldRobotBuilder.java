package builderPattern;

public class OldRobotBuilder implements RobotBuilder{

	private Robot robot;
	
	public OldRobotBuilder() {
		this.robot = new Robot();
	}
	
	public void buildRobotHead() {
		// TODO Auto-generated method stub
		robot.setRobotHead("Tin head");
	}

	public void buildRobotTorso() {
		// TODO Auto-generated method stub
		robot.setRobotTorso("Tin Torso");
	}

	public void buildRobotArms() {
		// TODO Auto-generated method stub
		robot.setRobotArms("Blow torch Arms");
	}

	public void buildRobotLegs() {
		// TODO Auto-generated method stub
		robot.setRobotLegs("Rollar Skates");
	}

	public Robot getRobot() {
		// TODO Auto-generated method stub
		return this.robot;
	}

}
