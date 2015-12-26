package es.shaddow.headfirst.designpatterns.command;

public class GarageDoorOpenCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		super();
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}

}
