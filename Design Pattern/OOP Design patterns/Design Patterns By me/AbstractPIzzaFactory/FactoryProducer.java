package AbstractPIzzaFactory;

public class FactoryProducer {
	
	public AbstractFactory createFactory(String msg) {
		if(msg.equalsIgnoreCase("Chicken"))
			return new ChickenFactory();
		else if(msg.equalsIgnoreCase("Dough"))
			return new DoughFactory();
		
		else
		return null;
	
	
	}

}
