package decorator;

public abstract class ToppingDecorator implements Pizza {

	private Pizza pizza;
	public ToppingDecorator(Pizza nPizza) {
		pizza = nPizza;
	}

}
