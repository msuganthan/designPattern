package builderPattern;

public class Robot implements RobotPlan {

	private String robotHead;
	private String robotTorso;
	private String robotArms;
	private String robotLegs;
	
	public void setRobotHead(String head) {
		// TODO Auto-generated method stub
		this.robotHead = head;
	}
	
	public String getRobotHead() { 
		return this.robotHead;
	}

	public void setRobotTorso(String torso) {
		// TODO Auto-generated method stub
		this.robotTorso = torso;
	}
	
	public String getRobotTorso() { 
		return this.robotTorso;
	}

	public void setRobotArms(String arms) {
		// TODO Auto-generated method stub
		this.robotArms = arms;
	}
	
	public String getRobotArms() { 
		return this.robotArms;
	}

	public void setRobotLegs(String legs) {
		// TODO Auto-generated method stub
		this.robotLegs = legs;
	}
	
	public String getRobotLegs() { 
		return this.robotLegs;
	}

}
