package de.wumpe.carrental.vehicle.type.car;

import de.wumpe.carrental.vehicle.Vehicle;
import de.wumpe.carrental.vehicle.type.Car;

public class Pickup extends Car {
    private boolean allWheel;

    public Pickup(String licensePlate, String producer, long productID, float topSpeed, float mileageRate, String color, float kilowatt, float rentalPrice, boolean rented, byte seats, byte people, boolean allWheel) {
        super(licensePlate, producer, productID, topSpeed, mileageRate, color, kilowatt, rentalPrice, rented, seats, people);
        this.allWheel = allWheel;
    }

    public boolean isAllWheel() {
        return allWheel;
    }

    public void setAllWheel(boolean allWheel) {
        this.allWheel = allWheel;
    }

    @Override
    public String toString() {
        return "CarRental: Pickup" +
                "\n Kennzeichen:   " + getLicensePlate() +
                "\n Hersteller:    " + getProducer() +
                "\n Artikelnummer: " + getProductID() +
                "\n Max. Tempo:    " + getTopSpeed() +
                "\n KM-Stand:      " + getMileageRate() +
                "\n Farbe:         " + getColor() +
                "\n Kilowatt:      " + getKilowatt() +
                "\n Mietpreis:     " + getRentalPrice() +
                "\n Vermietet?:    " + (isRented() ? "Ja" : "Nein") +
                "\n Sitze:         " + getSeats() +
                "\n Mitfahren:     " + getPeople() +
                "\n Allrad:        " + (isAllWheel() ? "Ja" : "Nein");
    }
}
