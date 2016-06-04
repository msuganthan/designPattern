package ChainOfResponsibility;

public interface Chain {

	void setNextChain(Chain chain2);

	void calculate(Numbers number);

}
