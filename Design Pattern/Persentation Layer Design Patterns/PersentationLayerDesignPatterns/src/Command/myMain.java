package Command;

public class myMain {
	public static void main(String[] args) {

		Light livingRoomLight=new LivingRoomLight();
		Light kitchenRoomLight= new KitchenLight();
		
		RemoteController remoteController= new RemoteController();
		
		Command lightOnCommand1= new LightOnCommand(livingRoomLight);
		Command lightoffCommand1= new LightOffCommand(livingRoomLight);
	
		remoteController.setCommand(lightOnCommand1, lightoffCommand1);
		
		remoteController.onButtonPushed();
		remoteController.offButtonPushed();
		
		
		
		Command lightOnCommand2= new LightOnCommand(kitchenRoomLight);
		Command lightoffCommand2= new LightOffCommand(kitchenRoomLight);
		
		remoteController.setCommand(lightOnCommand2, lightoffCommand2);
		
		remoteController.onButtonPushed();
		remoteController.offButtonPushed();
		
		}

}
