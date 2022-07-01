package de.wumpe.carrental.command;

import java.util.HashMap;

public class RemoveCommand {
    private final HashMap<Long, Object> vehicles;

    public RemoveCommand(HashMap<Long, Object> vehicles) {
        this.vehicles = vehicles;
    }

    public void executeCommand(String[] arguments) {
        if (arguments.length < 2) {
            System.out.println("Bitte benutze: 'remove <ID>'");
            return;
        }

        long id;

        try {
            id = Long.parseLong(arguments[1]);
        } catch (NumberFormatException exception) {
            System.out.printf("'%s' ist keine Zahl\n", arguments[1]);
            return;
        }

        if (vehicles.get(id) == null) {
            System.out.printf("Das Fahrzeug '%d' existiert nicht\n", id);
            return;
        }

        vehicles.remove(id);
        System.out.printf("Das Fahrzeug '%d' wurde entfernt\n", id);
    }
}
