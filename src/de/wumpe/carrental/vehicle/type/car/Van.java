package de.wumpe.carrental.vehicle.type.car;

import de.wumpe.carrental.vehicle.type.Car;

public class Van extends Car {
    private boolean roofBox;

    public Van(String licensePlate, String producer, long productID, float topSpeed, float mileageRate, String color, float kilowatt, float rentalPrice, boolean rented, byte seats, byte people, boolean roofBox) {
        super(licensePlate, producer, productID, topSpeed, mileageRate, color, kilowatt, rentalPrice, rented, seats, people);
        this.roofBox = roofBox;
    }

    public boolean isRoofBox() {
        return roofBox;
    }

    public void setRoofBox(boolean roofBox) {
        this.roofBox = roofBox;
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
                "\n Dachbox:        " + (isRoofBox() ? "Ja" : "Nein");
    }
}
