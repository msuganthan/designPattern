package commandPattern;

public class TurnTVOff implements Command {

	ElectronicDevice device;
	public TurnTVOff(ElectronicDevice device) {
		this.device = device;
	}
	
	public void execute() {
		// TODO Auto-generated method stub
		device.off();
	}

	
}
