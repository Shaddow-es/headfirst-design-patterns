package es.shaddow.headfirst.designpatterns.command;

public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light) {
		super();
		this.light = light;
	}

	public void execute() {
		light.on();
	}

}
