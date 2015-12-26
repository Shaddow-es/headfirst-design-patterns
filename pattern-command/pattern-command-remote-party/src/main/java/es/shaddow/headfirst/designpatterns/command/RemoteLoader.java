package es.shaddow.headfirst.designpatterns.command;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();

		Light light = new Light("Living Room");
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");
		Hottub hottub = new Hottub();

		LightOnCommand lightOn = new LightOnCommand(light);
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		TVOnCommand tvOn = new TVOnCommand(tv);
		HotTubOnCommand hottubOn = new HotTubOnCommand(hottub);

		LightOffCommand lightOff = new LightOffCommand(light);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		TVOffCommand tvOff = new TVOffCommand(tv);
		HotTubOffCommand hottubOff = new HotTubOffCommand(hottub);

		Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn };
		Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff };

		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);

		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On ---");
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- Pushing Macro Off ---");
		remoteControl.offButtonWasPushed(0);
	}
}
