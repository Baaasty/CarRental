package de.wumpe.carrental;

import de.wumpe.carrental.command.*;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public abstract class CarRental {
    private static final HashMap<Long, Object> vehicles = new HashMap<>();

    public static void main(String[] args) throws InterruptedException {
        sendHelloMessage();

        HelpCommand helpCommand = new HelpCommand();
        ArgumentsCommand argumentsCommand = new ArgumentsCommand();
        AddCommand addCommand = new AddCommand(vehicles);
        RemoveCommand removeCommand = new RemoveCommand(vehicles);
        ListCommand listCommand = new ListCommand(vehicles);
        InfoCommand infoCommand = new InfoCommand(vehicles);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("INPUT: ");

            String[] arguments = scanner.nextLine().split(" "); // Read the next line with the scanner and split at every space

            switch (arguments[0].toUpperCase()) {
                case "END" -> {
                    System.out.println("Programm wird beendet..."); // Goodbye message
                    scanner.close();
                    return; // End to program
                }
                case "HELP" -> helpCommand.executeCommand();
                case "ARGUMENTS" -> argumentsCommand.executeCommand();
                case "ADD" -> addCommand.executeCommand(arguments);
                case "REMOVE" -> removeCommand.executeCommand(arguments);
                case "LIST" -> listCommand.executeCommand();
                case "INFO" -> infoCommand.executeCommand(arguments);
                default -> System.out.println("Bitte benutze 'help'!");
            }

            TimeUnit.MILLISECONDS.sleep(500);
        }
    }

    private static void sendHelloMessage() {
        System.out.println("""
                                          Welcome to
                      _____               _____               _          _
                     / ____|             |  __ \\             | |        | |
                    | |      __ _  _ __  | |__) | ___  _ __  | |_  __ _ | |
                    | |     / _` || '__| |  _  / / _ \\| '_ \\ | __|/ _` || |
                    | |____| (_| || |    | | \\ \\|  __/| | | || |_| (_| || |
                     \\_____|\\__,_||_|    |_|  \\_\\\\___||_| |_| \\__|\\__,_||_|

                """);
    }
}
