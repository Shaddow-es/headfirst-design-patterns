package es.shaddow.headfirst.designpatterns.command;

public class RemoteControl {
	private static final int NUM_SLOTS = 7;

	private Command[] onCommands;
	private Command[] offCommands;
	private Command undoCommand;

	public RemoteControl() {
		onCommands = new Command[NUM_SLOTS];
		offCommands = new Command[NUM_SLOTS];

		for (int i = 0; i < NUM_SLOTS; i++) {
			onCommands[i] = new NoCommand();
			offCommands[i] = new NoCommand();
		}
		
		undoCommand  = new NoCommand();
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}

	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}

	public void undoButtonWasPushed(){
		undoCommand.undo();
	}
	
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "    "
					+ offCommands[i].getClass().getName() + "\n");
		}
		stringBuff.append("[undo] " + undoCommand.getClass().getName() + "\n");
		return stringBuff.toString();
	}
}
