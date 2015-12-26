package es.shaddow.headfirst.designpatterns.command;

public class StereoOnWithCDCommand implements Command {
	Stereo stereo;

	public StereoOnWithCDCommand(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}

	public void undo() {
		stereo.off();
	}

}
