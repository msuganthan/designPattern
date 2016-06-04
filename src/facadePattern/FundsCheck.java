package facadePattern;

public class FundsCheck {
	private double cashInAccount = 1000.00;
	public double getCashInAccount() {
		return cashInAccount;
	}
	
	public void decreaseCashInAccount(double cashWithdrawn) {
		cashInAccount -=cashWithdrawn;
	}
	
	public void increaseCashInAccount(double cashDeposited) {
		cashInAccount +=cashDeposited;
	}
	
	public void withDraw(double cashToWithdraw) {
		if(cashToWithdraw > getCashInAccount()) {
			System.out.println("Error you don't have enough money");
			System.out.println("Current Balance "+ getCashInAccount());
		} else {
			decreaseCashInAccount(cashToWithdraw);
			System.out.println("Withdrawal complete : Current Balance is "+getCashInAccount());
		}
	}
	
	public void makeDeposit(double cashToDeposit) {
		increaseCashInAccount(cashToDeposit);
		System.out.println("Deposit Complete: Current Balance is"+getCashInAccount());
	}
}
