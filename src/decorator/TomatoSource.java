package decorator;

public class TomatoSource extends ToppingDecorator{

	Pizza pizza;
	
	
	public TomatoSource(Pizza nPizza) {
		super(nPizza);
		// TODO Auto-generated constructor stub
		System.out.println("Adding Sauce");
	}

	public String getDescription(){
		
		return pizza.getDescription() + ", mozzarella";
		
	}
	
	public double getCost(){
		
		System.out.println("Cost of Moz: " + .50);
		
		return pizza.getCost() + .50;
		
	}

	

}
