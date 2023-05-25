package PizzaFactory;

public class PizzaFactory {
	
	public Pizza createPizza(String msg) {
		if(msg.equalsIgnoreCase("veggie"))
			return new VeggiePizza();
		else if(msg.equalsIgnoreCase("cheese"))
			return new ChessePizza();
		else if(msg.equalsIgnoreCase("chicken"))
			return new ChickenPizza();
		else
		return null;
	
	
	}

}
