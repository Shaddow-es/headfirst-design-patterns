package es.shaddow.headfirst.designpatterns.command;

public class MacroCommand implements Command {
	Command[] commands;

	public MacroCommand(Command[] commands) {
		super();
		this.commands = commands;
	}

	public void execute() {
		for (int i = 0; i < commands.length; i++) {
			commands[i].execute();
		}
	}

	public void undo() {
		// Recorre el array al revés para asegurar que el undo funciona bien
		for (int i = commands.length - 1; i >= 0; i--) {
			commands[i].undo();
		}
	}

}
