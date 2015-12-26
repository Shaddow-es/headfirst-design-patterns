package es.shaddow.headfirst.designpatterns.command;

public class HotTubOnCommand implements Command {
	Hottub hottub;

	public HotTubOnCommand(Hottub hottub) {
		super();
		this.hottub = hottub;
	}

	public void execute() {
		hottub.on();
		hottub.setTemperature(28);
		hottub.circulate();
	}

	public void undo() {
		hottub.off();
	}
}
