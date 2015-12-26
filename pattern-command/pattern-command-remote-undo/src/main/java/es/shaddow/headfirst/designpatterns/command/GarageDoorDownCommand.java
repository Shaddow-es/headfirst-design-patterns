package es.shaddow.headfirst.designpatterns.command;

public class GarageDoorDownCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorDownCommand(GarageDoor garageDoor) {
		super();
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.down();
	}

	public void undo() {
		garageDoor.up();
	}
}
