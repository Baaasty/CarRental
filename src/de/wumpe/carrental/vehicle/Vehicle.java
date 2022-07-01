package de.wumpe.carrental.vehicle;

public class Vehicle {
    private String licensePlate; // initiate attributes in the class
    private String producer;
    private long productID;
    private float topSpeed;
    private float mileageRate;
    private String color;
    private float kilowatt;
    private float rentalPrice;
    private boolean rented;

    public Vehicle(String licensePlate, String producer, long productID, float topSpeed,
                   float mileageRate, String color, float kilowatt, float rentalPrice, boolean rented) {
        this.licensePlate = licensePlate;   // "this." returns the class
        this.producer = producer;
        this.productID = productID;
        this.topSpeed = topSpeed;
        this.mileageRate = mileageRate;
        this.color = color;
        this.kilowatt = kilowatt;
        this.rentalPrice = rentalPrice;
        this.rented = rented;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getProducer() {
        return producer;
    }

    public long getProductID() {
        return productID;
    }

    public float getTopSpeed() {
        return topSpeed;
    }

    public float getMileageRate() {
        return mileageRate;
    }

    public String getColor() {
        return color;
    }

    public float getKilowatt() {
        return kilowatt;
    }

    public float getRentalPrice() {
        return rentalPrice;
    }

    public boolean isRented() {
        return rented;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public void setTopSpeed(float topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setMileageRate(float mileageRate) {
        this.mileageRate = mileageRate;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setKilowatt(float kilowatt) {
        this.kilowatt = kilowatt;
    }

    public void setRentalPrice(float rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }
}
