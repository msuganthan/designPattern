package bridgePattern;

public abstract class RemoteButton {
	private EntertainmentDevice theDevice;
	
	public RemoteButton(EntertainmentDevice newDevice) {
		theDevice = newDevice;
	}
	
	public void buttonFivePressed() {
		theDevice.buttonFivePressesed();
	}
	
	public void buttonSixPressed() {
		theDevice.buttonSixPressesed();
	}
	
	public void deviceFeedback() {
		theDevice.deviceFeedback();
	}
	
	public abstract void buttonNinePressed();
}
