package bridgePattern;

public class DVDRemote extends RemoteButton {

	public DVDRemote(EntertainmentDevice newDevice) {
		super(newDevice);
		// TODO Auto-generated constructor stub
	}

	private boolean play = true;
	
	public void buttonNinePressed() {
		// TODO Auto-generated method stub
		play = !play;
		System.out.println("DVD is playing"+play);
	}

}
