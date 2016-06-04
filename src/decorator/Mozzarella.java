package decorator;

public class Mozzarella extends ToppingDecorator {

	Pizza pizza;
	
	public Mozzarella(Pizza nPizza) {
		super(nPizza);
		// TODO Auto-generated constructor stub
		
		System.out.println("Adding Dough");
		System.out.println("Adding Moz");
	}

	// PlainPizza and adds " mozzarella" to it
	
	public String getDescription(){
		
		return pizza.getDescription() + ", mozzarella";
		
	}
	
	public double getCost(){
		
		System.out.println("Cost of Moz: " + .50);
		
		return pizza.getCost() + .50;
		
	}

}
