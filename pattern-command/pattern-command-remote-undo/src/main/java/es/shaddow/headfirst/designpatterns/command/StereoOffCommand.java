package es.shaddow.headfirst.designpatterns.command;

public class StereoOffCommand implements Command {
	Stereo stereo;

	public StereoOffCommand(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	public void execute() {
		stereo.off();
	}

	public void undo() {
		stereo.on();
	}
}
