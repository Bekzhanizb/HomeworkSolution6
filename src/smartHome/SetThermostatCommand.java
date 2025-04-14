package smartHome;

public class SetThermostatCommand {
    private final Thermostat thermostat;
    private final int temperature;

    public SetThermostatCommand(Thermostat thermostat, int temperature) {
        this.thermostat = thermostat;
        this.temperature = temperature;
    }

    public void execute() {
        thermostat.setTemperature(temperature);
    }

    public void undo() {
        thermostat.revertTemperature();
    }
}
