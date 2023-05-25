package Command;

public class KitchenLight implements Light{

	@Override
	public void on() {
		System.out.println("switch on() Kitchen Room Light");
		
	}

	@Override
	public void off() {
		System.out.println("switch off() Kitchen Room Light");
		
	}
	

}
