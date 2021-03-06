package es.shaddow.headfirst.designpatterns.command;

public class LightOffCommand implements Command {
	Light light;

	public LightOffCommand(Light light) {
		super();
		this.light = light;
	}

	public void execute() {
		light.off();
	}

}
