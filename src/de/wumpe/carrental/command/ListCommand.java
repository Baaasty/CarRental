package de.wumpe.carrental.command;

import de.wumpe.carrental.vehicle.Vehicle;

import java.util.HashMap;

public class ListCommand {
    private final HashMap<Long, Object> vehicles;

    public ListCommand(HashMap<Long, Object> vehicles) {
        this.vehicles = vehicles;
    }

    public void executeCommand() {
        if (vehicles.size() < 1) {
            System.out.println("Es existieren keine Fahrzeuge");
            return;
        }

        System.out.println("CarRental: Fahrzeuge");
        vehicles.forEach((id, object) -> System.out.printf(" %d - %s\n", id, ((Vehicle) object).getLicensePlate()));
    }
}
