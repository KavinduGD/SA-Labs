package Command;

public class RemoteController {
	
	Command onCommand;
	Command offCommand;
	
	void setCommand(Command onCommand,Command offCommand) {
		this.onCommand=onCommand;
		this.offCommand=offCommand;
	}
	
	public void onButtonPushed() {
		onCommand.excute();
	}
	
	public void offButtonPushed() {
		offCommand.excute();
	}
	
	


}
