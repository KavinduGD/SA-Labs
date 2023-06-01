package AbstractPIzzaFactory;

public class DoughFactory  extends AbstractFactory {

	public Dough createDough(String msg) {
		if(msg.equalsIgnoreCase("Thin"))
			return new ThinDough();
		else if(msg.equalsIgnoreCase("Thick"))
			return new ThinDough();
		else if(msg.equalsIgnoreCase("Double"))
			return new DoubleLayerDOugh();
		else
		return null;
	
	
	}

	@Override
	public Chicken createChicken(String msg) {
		// TODO Auto-generated method stub
		return null;
	}
}
