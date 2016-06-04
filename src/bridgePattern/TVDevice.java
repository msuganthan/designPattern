package bridgePattern;

public class TVDevice extends EntertainmentDevice{

	public TVDevice(int newDeviceState, int newMaxSetting) {
		deviceState = newDeviceState;
		maxSetting = newMaxSetting;
	}
	
	public void buttonFivePressesed() {
		// TODO Auto-generated method stub
		System.out.println("Channel Down");
		deviceState--;
	}

	public void buttonSixPressesed() {
		// TODO Auto-generated method stub
		System.out.println("Channel up");
		deviceState++;
	}

}
