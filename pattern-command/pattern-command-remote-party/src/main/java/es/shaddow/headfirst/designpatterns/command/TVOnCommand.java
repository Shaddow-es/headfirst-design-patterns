package es.shaddow.headfirst.designpatterns.command;

public class TVOnCommand implements Command {
	TV tv;

	public TVOnCommand(TV tv) {
		super();
		this.tv = tv;
	}

	public void execute() {
		tv.on();
		tv.setInputChannel();
	}

	public void undo() {
		tv.off();
	}

}
