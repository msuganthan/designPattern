package proxyPattern;

public interface ATMState {

	void insertCard();
	void ejectCard();
	void insertPin(int pinEntered);
	void requestCase(int cashToWithdraw);

}
