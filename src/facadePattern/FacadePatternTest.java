package facadePattern;

public class FacadePatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountFacade bankAccountFacade = new BankAccountFacade(123456789, 1234);
		bankAccountFacade.withdrawCash(50.00);
		bankAccountFacade.withdrawCash(900.00);
		bankAccountFacade.withdrawCash(900.00);
	}

}
