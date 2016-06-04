package bridgePattern;

public class DVDDevice extends EntertainmentDevice{
	
	public DVDDevice(int newDeviceState, int newMaxSetting) {
		deviceState = newDeviceState;
		maxSetting = newMaxSetting;
	}
	
	public void buttonFivePressesed() {
		// TODO Auto-generated method stub
		System.out.println("DVD skips to chapter");
		deviceState--;
	}

	public void buttonSixPressesed() {
		// TODO Auto-generated method stub
		System.out.println("DVD skips to next chapter");
		deviceState++;
	}
}
