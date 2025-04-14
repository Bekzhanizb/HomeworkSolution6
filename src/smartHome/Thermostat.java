package smartHome;

public class Thermostat {
    private int currentTemp = 22;
    private int previousTemp = 22;

    public void setTemperature(int temp) {
        previousTemp = currentTemp;
        currentTemp = temp;
        System.out.println("[Thermostat] Setting temperature to" + temp + "°C");
    }

    public void revertTemperature() {
        currentTemp = previousTemp;
        System.out.println("[Thermostat] Reverting to previous temperature: " + currentTemp + "°C");
    }
}
