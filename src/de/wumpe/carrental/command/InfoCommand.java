package de.wumpe.carrental.command;

import java.util.HashMap;

public class InfoCommand {
    private final HashMap<Long, Object> vehicles;

    public InfoCommand(HashMap<Long, Object> vehicles) {
        this.vehicles = vehicles;
    }

    public void executeCommand(String[] arguments) {
        if (arguments.length < 2) {
            System.out.println("Bitte benutze: 'list <ID>'");
            return;
        }

        try {
            System.out.println(vehicles.get(Long.parseLong(arguments[1])));
        } catch (NumberFormatException exception) {
            System.out.printf("'%s' ist keine Zahl\n", arguments[1]);
        }
    }
}
