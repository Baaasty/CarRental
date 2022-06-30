package de.wumpe.carrental;

import de.wumpe.carrental.vehicle.Vehicle;
import de.wumpe.carrental.vehicle.type.Truck;
import de.wumpe.carrental.vehicle.type.car.Cabriolet;
import de.wumpe.carrental.vehicle.type.car.Pickup;
import de.wumpe.carrental.vehicle.type.car.Van;

import java.util.HashMap;
import java.util.Scanner;

public class CarRental {
    private static final HashMap<Long, Object> vehicles = new HashMap<>();

    public static void main(String[] args) {
        sendHelloMessage();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("INPUT: ");

            String input = scanner.nextLine(); // Read the next line with the scanner
            String[] arguments = input.split(" ");

            switch (arguments[0].toUpperCase()) {
                case "END" -> {
                    System.out.println("Programm wird beendet..."); // Goodbye message
                    return; // End to program
                }
                case "HELP" -> {
                    System.out.println("CarRental: Hilfe");
                    System.out.println(" end             - Beendet das Programm");
                    System.out.println(" help            - Zeigt dir diese Hilfe an");
                    System.out.println(" arguments       - Listet alle Argumente auf");
                    System.out.println(" add <ID> <Type> - Füge ein Fahrzeug hinzu");
                    System.out.println(" remove <ID>     - Entferne ein Fahrzeug");
                    System.out.println(" list            - Listet dir alle Fahrzeuge auf");
                    System.out.println(" info <ID>       - Listet dir alle Infos eines Fahrzeugs auf");
                }
                case "ARGUMENTS" -> {
                    System.out.println("CarRental: Argumente");
                    System.out.println(" CABRIOLET - String:licensePlate String:produces long:productID float:topSpeed float:mileageRate String:color float:kilowatt float:rentalPrice boolean:rented byte:seats byte:people String:roof boolean:open");
                    System.out.println(" VAN       - String:licensePlate String:produces long:productID float:topSpeed float:mileageRate String:color float:kilowatt float:rentalPrice boolean:rented byte:seats byte:people bollean:roofBox");
                    System.out.println(" PICKUP    - String:licensePlate String:produces long:productID float:topSpeed float:mileageRate String:color float:kilowatt float:rentalPrice boolean:rented byte:seats byte:people boolean:allWheel");
                    System.out.println(" TRUCK     - String:licensePlate String:produces long:productID float:topSpeed float:mileageRate String:color float:kilowatt float:rentalPrice boolean:rented byte:axles double:maxLoad");
                }
                case "ADD" -> add(arguments);
                case "REMOVE" -> remove(arguments);
                case "LIST" -> {
                    if (vehicles.size() < 1) {
                        System.out.println("Es existieren keine Fahrzeuge");
                        break;
                    }

                    System.out.println("CarRental: Fahrzeuge");
                    vehicles.forEach((id, object) -> System.out.printf(" %d - %s\n", id, ((Vehicle) object).getLicensePlate()));
                }
                case "INFO" -> {
                    if (arguments.length < 2) {
                        System.out.println("Bitte benutze: 'list <ID>'");
                        break;
                    }

                    try {
                        System.out.println(vehicles.get(Long.parseLong(arguments[1])));
                    } catch (NumberFormatException exception) {
                        System.out.printf("'%s' ist keine Zahl\n", arguments[1]);
                    }
                }
                default -> System.out.println("Bitte benutze 'help'!");
            }
        }
    }

    private static void sendHelloMessage() {
        System.out.print("                         Welcome");   // "print" without line break
        System.out.print(" to\n");                              // "\n" make a line break
        System.out.println("     _____               _____               _          _ ");   // "println" auto line break
        System.out.println("    / ____|             |  __ \\             | |        | |");  // You cant use a "\". Use "\\" for "\"
        System.out.println("   | |      __ _  _ __  | |__) | ___  _ __  | |_  __ _ | |");
        System.out.println("   | |     / _` || '__| |  _  / / _ \\| '_ \\ | __|/ _` || |");
        System.out.println("   | |____| (_| || |    | | \\ \\|  __/| | | || |_| (_| || |");
        System.out.println("    \\_____|\\__,_||_|    |_|  \\_\\\\___||_| |_| \\__|\\__,_||_|\n\n");
    }

    private static void add(String[] arguments) {
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
                case "CABRIOLET" -> vehicles.put(id, new Cabriolet(arguments[3],
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
                case "VAN" -> vehicles.put(id, new Van(arguments[3],
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
                case "PICKUP" -> vehicles.put(id, new Pickup(arguments[3],
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
                case "TRUCK" -> vehicles.put(id, new Truck(arguments[3],
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
                default -> System.out.println("Mögliche Types: CABRIOLET, VAN, PICKUP, TRUCK");
            }
        } catch (NumberFormatException exception) {
            System.out.println("Überprüfe deine Argumente");
            System.out.println("Tipp: 'arguments'");
        }
    }

    private static void remove(String[] arguments) {
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
