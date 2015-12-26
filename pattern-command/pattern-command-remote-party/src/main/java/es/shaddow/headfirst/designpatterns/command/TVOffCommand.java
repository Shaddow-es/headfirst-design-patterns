package es.shaddow.headfirst.designpatterns.command;

public class TVOffCommand implements Command {
	TV tv;

	public TVOffCommand(TV tv) {
		super();
		this.tv = tv;
	}

	public void execute() {
		tv.off();
	}

	public void undo() {
		tv.on();
	}
}
