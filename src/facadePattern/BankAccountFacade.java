package facadePattern;

public class BankAccountFacade {

	private int accountNumber;
	private int securityCode;
	
	AccountNumberCheck acctChecker;
	SecurityCodeCheck codeChecker;
	FundsCheck fundChecker;
	
	WelcomeToBank bankWelcome;
	
	public BankAccountFacade(int nAccountNumber, int nSecurityCode) {
		// TODO Auto-generated constructor stub
		this.accountNumber = nAccountNumber;
		this.securityCode = nSecurityCode;
		
		acctChecker = new AccountNumberCheck();
		codeChecker = new SecurityCodeCheck();
		fundChecker = new FundsCheck();
		bankWelcome = new WelcomeToBank();
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public int getSecurityCode() {
		return securityCode;
	}

	public void withdrawCash(double cashToGet) {
		// TODO Auto-generated method stub
		if(acctChecker.accountActive(getAccountNumber()) &&
				codeChecker.isCodeCorrect(getSecurityCode()) &&
				true) {
			fundChecker.withDraw(cashToGet);
					System.out.println("Transaction Complete\n");
					
				} else {
					
					System.out.println("Transaction Failed\n");
					
				}
	}
	
	

}
