package commandPattern;

public class TurnTVOn implements Command {

	ElectronicDevice device;
	public TurnTVOn(ElectronicDevice device) {
		this.device = device;
	}
	
	public void execute() {
		// TODO Auto-generated method stub
		device.off();
	}

	
}
