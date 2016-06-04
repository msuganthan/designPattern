package ChainOfResponsibility;

public class TestCalcChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chain chain1 = new AddNumbers();
		Chain chain2 = new SubtractNumbers();
		Chain chain3 = new MultNumbers();
		Chain chain4 = new DivideNumbers();
		
		chain1.setNextChain(chain2);
		chain2.setNextChain(chain3);
		chain3.setNextChain(chain4);
		
		Numbers number = new Numbers(4, 2, "add");
		
		chain1.calculate(number);
	}

}
