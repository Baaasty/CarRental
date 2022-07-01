package de.wumpe.carrental.command;

public class HelpCommand {
    public void executeCommand() {
        System.out.println("""
                CarRental: Hilfe
                 end             - Beendet das Programm
                 help            - Zeigt dir diese Hilfe an
                 arguments       - Listet alle Argumente auf
                 add <ID> <Type> - Füge ein Fahrzeug hinzu
                 remove <ID>     - Entferne ein Fahrzeug
                 list            - Listet dir alle Fahrzeuge auf
                 info <ID>       - Listet dir alle Infos eines Fahrzeugs auf""");
    }
}
