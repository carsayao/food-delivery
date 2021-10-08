package com.company;

public class Driver {

    protected double proximity;
    protected Name driver;

    public Driver(double proximity, String driver) {
        this.proximity = proximity;
        this.driver = new Name(driver);
    }

    public double getProximity() {
        return this.proximity;
    }
}
