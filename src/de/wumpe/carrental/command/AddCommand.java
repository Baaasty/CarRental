package de.wumpe.carrental.command;

import de.wumpe.carrental.vehicle.type.Truck;
import de.wumpe.carrental.vehicle.type.car.Cabriolet;
import de.wumpe.carrental.vehicle.type.car.Pickup;
import de.wumpe.carrental.vehicle.type.car.Van;

import java.util.HashMap;

public class AddCommand {
    private final HashMap<Long, Object> vehicles;

    public AddCommand(HashMap<Long, Object> vehicles) {
        this.vehicles = vehicles;
    }

    public void executeCommand(String[] arguments) {
        if (arguments.length < 3) {
            System.out.println("Bitte benutze: 'add <ID> <Type>'");
            return;
        }

        long id;

        try {
            id = Long.parseLong(arguments[1]);
        } catch (NumberFormatException exception) {
            System.out.printf("'%s' ist keine Zahl\n", arguments[1]);
            return;
        }

        try {
            switch (arguments[2].toUpperCase()) {
                case "CABRIOLET" -> {
                    if (arguments.length < 15) {
                        System.out.println("Überprüfe deine Argumente");
                        System.out.println("Tipp: 'arguments'");
                        return;
                    }

                    vehicles.put(id, new Cabriolet(arguments[3],
                            arguments[4],
                            Long.parseLong(arguments[5]),
                            Long.parseLong(arguments[6]),
                            Float.parseFloat(arguments[7]),
                            arguments[8],
                            Float.parseFloat(arguments[9]),
                            Float.parseFloat(arguments[10]),
                            Boolean.parseBoolean(arguments[11]),
                            Byte.parseByte(arguments[12]),
                            Byte.parseByte(arguments[12]),
                            arguments[13],
                            Boolean.parseBoolean(arguments[14])));
                }
                case "VAN" -> {
                    if (arguments.length < 15) {
                        System.out.println("Überprüfe deine Argumente");
                        System.out.println("Tipp: 'arguments'");
                        return;
                    }

                    vehicles.put(id, new Van(arguments[3],
                            arguments[4],
                            Long.parseLong(arguments[5]),
                            Long.parseLong(arguments[6]),
                            Float.parseFloat(arguments[7]),
                            arguments[8],
                            Float.parseFloat(arguments[9]),
                            Float.parseFloat(arguments[10]),
                            Boolean.parseBoolean(arguments[11]),
                            Byte.parseByte(arguments[12]),
                            Byte.parseByte(arguments[13]),
                            Boolean.parseBoolean(arguments[14])));
                }
                case "PICKUP" -> {
                    if (arguments.length < 15) {
                        System.out.println("Überprüfe deine Argumente");
                        System.out.println("Tipp: 'arguments'");
                        return;
                    }

                    vehicles.put(id, new Pickup(arguments[3],
                            arguments[4],
                            Long.parseLong(arguments[5]),
                            Long.parseLong(arguments[6]),
                            Float.parseFloat(arguments[7]),
                            arguments[8],
                            Float.parseFloat(arguments[9]),
                            Float.parseFloat(arguments[10]),
                            Boolean.parseBoolean(arguments[11]),
                            Byte.parseByte(arguments[12]),
                            Byte.parseByte(arguments[13]),
                            Boolean.parseBoolean(arguments[14])));
                }
                case "TRUCK" -> {
                    if (arguments.length < 14) {
                        System.out.println("Überprüfe deine Argumente");
                        System.out.println("Tipp: 'arguments'");
                        return;
                    }

                    vehicles.put(id, new Truck(arguments[3],
                            arguments[4],
                            Long.parseLong(arguments[5]),
                            Long.parseLong(arguments[6]),
                            Float.parseFloat(arguments[7]),
                            arguments[8],
                            Float.parseFloat(arguments[9]),
                            Float.parseFloat(arguments[10]),
                            Boolean.parseBoolean(arguments[11]),
                            Byte.parseByte(arguments[12]),
                            Double.parseDouble(arguments[13])));
                }
                default -> {
                    System.out.println("Mögliche Types: CABRIOLET, VAN, PICKUP, TRUCK");
                    return;
                }
            }

            System.out.printf("Das Fahrzeug '%d' wurde hinzugefügt\n", id);
        } catch (NumberFormatException exception) {
            System.out.println("Überprüfe deine Argumente");
            System.out.println("Tipp: 'arguments'");
        }
    }
}
