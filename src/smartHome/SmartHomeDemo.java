package smartHome;

public class SmartHomeDemo {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        Command lightOnCommand = new TurnOnLightCommand(light);
        Command setTempCommand = new SetThermostatCommand(thermostat, 25);

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();
        remote.setCommand("A", lightOnCommand);
        remote.setCommand("B", setTempCommand);

        remote.pressButton("A");
        remote.pressButton("B");
        remote.pressUndo();
    }
}
