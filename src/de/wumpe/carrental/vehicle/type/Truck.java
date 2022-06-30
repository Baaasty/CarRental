package de.wumpe.carrental.vehicle.type;

import de.wumpe.carrental.vehicle.Vehicle;

public class Truck extends Vehicle {
    private byte axles;
    private double maxLoad;

    public Truck(String licensePlate, String producer, long productID, float topSpeed, float mileageRate, String color, float kilowatt, float rentalPrice, boolean rented, byte axles, double maxLoad) {
        super(licensePlate, producer, productID, topSpeed, mileageRate, color, kilowatt, rentalPrice, rented);
        this.axles = axles;
        this.maxLoad = maxLoad;
    }

    public byte getAxles() {
        return axles;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setAxles(byte axles) {
        this.axles = axles;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public String toString() {
        return "CarRental: Truck" +
                "\n Kennzeichen:   " + getLicensePlate() +
                "\n Hersteller:    " + getProducer() +
                "\n Artikelnummer: " + getProductID() +
                "\n Max. Tempo:    " + getTopSpeed() +
                "\n KM-Stand:      " + getMileageRate() +
                "\n Farbe:         " + getColor() +
                "\n Kilowatt:      " + getKilowatt() +
                "\n Mietpreis:     " + getRentalPrice() +
                "\n Vermietet?:    " + (isRented() ? "Ja" : "Nein") +
                "\n Achsen:        " + getAxles() +
                "\n Max. Ladung:   " + getMaxLoad();
    }
}
