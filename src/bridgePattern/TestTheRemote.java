package bridgePattern;

public class TestTheRemote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteButton theTV1 = new TVRemoteMute(new TVDevice(1, 200));
		RemoteButton theTV2 = new TVRemotePause(new TVDevice(1, 200));
		
		RemoteButton theDVD = new DVDRemote(new DVDDevice(1, 14));
		
		System.out.println("Test TV with mute");
		theTV1.buttonFivePressed();
		theTV1.buttonSixPressed();
		theTV1.buttonNinePressed();
		
		System.out.println("Test TV with Pause");
		theTV2.buttonFivePressed();
		theTV2.buttonSixPressed();
		theTV2.buttonNinePressed();
		
		System.out.println("Test DVD");
		theDVD.buttonFivePressed();
		theDVD.buttonSixPressed();
		theDVD.buttonNinePressed();
	}

}
