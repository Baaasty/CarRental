package de.wumpe.carrental.vehicle.type;

import de.wumpe.carrental.vehicle.Vehicle;

public abstract class Car extends Vehicle {
    private byte seats;
    private byte people;

    public Car(String licensePlate, String producer, long productID, float topSpeed, float mileageRate, String color, float kilowatt, float rentalPrice, boolean rented, byte seats, byte people) {
        super(licensePlate, producer, productID, topSpeed, mileageRate, color, kilowatt, rentalPrice, rented);
        this.seats = seats;
        this.people = people;
    }

    public byte getSeats() {
        return seats;
    }

    public byte getPeople() {
        return people;
    }

    public void setSeats(byte seats) {
        this.seats = seats;
    }

    public void setPeople(byte people) {
        this.people = people;
    }
}
