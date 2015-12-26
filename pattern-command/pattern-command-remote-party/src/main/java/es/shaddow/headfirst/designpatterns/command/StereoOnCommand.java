package es.shaddow.headfirst.designpatterns.command;

public class StereoOnCommand implements Command {
	Stereo stereo;

	public StereoOnCommand(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	public void execute() {
		stereo.on();
	}

	public void undo() {
		stereo.off();
	}

}
