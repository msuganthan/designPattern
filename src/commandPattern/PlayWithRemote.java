package commandPattern;

public class PlayWithRemote {
	public static void main(String[] args) {
		ElectronicDevice newDevice = new Television();
		TurnTVOn onCommand = new TurnTVOn(newDevice);
		DeviceButton onPressed = new DeviceButton(onCommand);
		onPressed.press();
	}
}
