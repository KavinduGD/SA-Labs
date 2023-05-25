package Command;

public class LivingRoomLight implements Light {
	
	@Override
	public void on() {
		System.out.println("switch on() Living Room Light");
		
	}

	@Override
	public void off() {
		System.out.println("switch off() Living Room Light");
		
	}

}
