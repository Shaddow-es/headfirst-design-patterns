package es.shaddow.headfirst.designpatterns.command;

public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		super();
		this.ceilingFan = ceilingFan;
	}

	public void execute() {
		ceilingFan.off();	
	}

}
