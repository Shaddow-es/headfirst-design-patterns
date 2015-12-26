package es.shaddow.headfirst.designpatterns.command;

public class GarageDoorUpCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		super();
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}

}
