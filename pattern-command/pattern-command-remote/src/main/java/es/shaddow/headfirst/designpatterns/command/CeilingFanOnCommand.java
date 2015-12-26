package es.shaddow.headfirst.designpatterns.command;

public class CeilingFanOnCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		super();
		this.ceilingFan = ceilingFan;
	}

	public void execute() {
		ceilingFan.high();
	}
}
