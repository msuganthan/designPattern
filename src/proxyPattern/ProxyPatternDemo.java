package proxyPattern;

public class ProxyPatternDemo {
	public static void main(String[] args) {
		ATMMachine atmMachine = new ATMMachine();
		atmMachine.insertCard();
		atmMachine.ejectCard();
		atmMachine.insertCard();
		atmMachine.insertPin(1234);
		atmMachine.requestCash(2000);
		atmMachine.insertCard();
		atmMachine.insertPin();
		
		GetATMData realATMMachine = new ATMMachine();
		GetATMData atmProxy = new ATMProxy();
		
		System.out.println("\n Current ATM state" + atmProxy.getATMState());
		System.out.println("\n Cash in ATM state $ " + atmProxy.getCashInMachine());
		
	}
}
