package de.wumpe.carrental.vehicle.type.car;

import de.wumpe.carrental.vehicle.type.Car;

public class Cabriolet extends Car {
    private String roof;
    private boolean open;

    public Cabriolet(String licensePlate, String producer, long productID, float topSpeed, float mileageRate, String color, float kilowatt, float rentalPrice, boolean rented, byte seats, byte people, String roof, boolean open) {
        super(licensePlate, producer, productID, topSpeed, mileageRate, color, kilowatt, rentalPrice, rented, seats, people);
        this.roof = roof;
        this.open = open;
    }

    public String getRoof() {
        return roof;
    }

    public boolean isOpen() {
        return open;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setOpen(boolean open) {
        this.open = open;
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
                "\n Dachart:       " + getRoof() +
                "\n Dach offen?:   " + (isOpen() ? "Ja" : "Nein");
    }
}
