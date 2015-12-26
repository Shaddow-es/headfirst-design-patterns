package es.shaddow.headfirst.designpatterns.command;

public class HotTubOffCommand implements Command {
	Hottub hottub;

	public HotTubOffCommand(Hottub hottub) {
		super();
		this.hottub = hottub;
	}

	public void execute() {
		hottub.setTemperature(22);
		hottub.off();
	}

	public void undo() {
		hottub.on();
	}
}
