package smartHome;

import java.util.HashMap;
import java.util.Map;

public class SmartHomeRemoteControl {
    private final Map<String, Command> slots = new HashMap<>();
    private Command lastCommand;

    public void setCommand(String slot, Command command) {
        slots.put(slot, command);
    }

    public void pressButton(String slot) {
        Command command = slots.get(slot);
        if (command != null) {
            command.execute();
            lastCommand = command;
        } else {
            System.out.println("[Remote] There is no team in the slot " + slot);
        }
    }

    public void pressUndo() {
        if (lastCommand != null) {
            lastCommand.undo();
        } else {
            System.out.println("[Remote] There is no command to cancel");
        }
    }
}
