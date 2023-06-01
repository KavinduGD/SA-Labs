package AbstractPIzzaFactory;



public class ChickenFactory extends AbstractFactory {

					
	public Chicken createChicken(String msg) {
		if(msg.equalsIgnoreCase("Masala"))
			return new MasalaChicken();
		else if(msg.equalsIgnoreCase("Thanduri"))
			return new ThanduriChicken();
		else if(msg.equalsIgnoreCase("Devel"))
			return new DevelChicken();
		else
		return null;
	
	
	}

	@Override
	public Dough createDough(String msg) {
		// TODO Auto-generated method stub
		return null;
	}
}
