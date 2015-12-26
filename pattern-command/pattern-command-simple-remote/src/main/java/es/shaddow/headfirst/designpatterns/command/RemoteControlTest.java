package es.shaddow.headfirst.designpatterns.command;

public class RemoteControlTest {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();

		Light light = new Light();
		Command ligthOn = new LightOnCommand(light);
		GarageDoor garageDoor = new GarageDoor();
		Command garageOpen = new GarageDoorOpenCommand(garageDoor);

		remote.setCommand(ligthOn);
		remote.buttonWasPressed();
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
	}
}
