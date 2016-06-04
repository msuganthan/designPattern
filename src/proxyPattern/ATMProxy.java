package proxyPattern;

public class ATMProxy implements GetATMData {

	public ATMState getATMState() {
		// TODO Auto-generated method stub
		ATMMachine realATMMachine = new ATMMachine();
		return realATMMachine.getATMData();
	}

	public int getCashInMachine() {
		ATMMachine realATMMachine = new ATMMachine();		
		return realATMMachine.getCashInMachine();
	}

}
