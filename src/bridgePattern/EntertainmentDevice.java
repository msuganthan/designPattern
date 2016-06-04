package bridgePattern;

public abstract class EntertainmentDevice {

		public int deviceState;
		public int maxSetting;
		public int volumeLevel = 0;
		
		public abstract void buttonFivePressesed();
		public abstract void buttonSixPressesed();
		
		public void deviceFeedback() {
			if(deviceState > maxSetting || deviceState <0) {
				deviceState = 0;
			}
			System.out.println("On Channel "+deviceState);
		}
		
		public void buttonSevenPressesed() {
			volumeLevel++;
			System.out.println("Volume at "+volumeLevel);
		}
		
		public void buttonEightPressed() {
			volumeLevel--;
			System.out.println("Volume at "+ volumeLevel);
		}
	
}
