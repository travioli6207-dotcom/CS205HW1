
package edu.monmouth.vehicle;

public class Boat implements Vehicle {

    private int boatLength;
    private PowerTypes powerSource;

    public Boat(PowerTypes powerSource, int boatLength)
            throws BoatException {
        setPowerSource(powerSource);
        setBoatLength(boatLength);
    }

    public int getBoatLength() {
        return boatLength;
    }

    public void setBoatLength(int boatLength)
            throws BoatException {
        if (boatLength < VehicleConstants.MINBOATLENGTH
                || boatLength > VehicleConstants.MAXBOATLENGTH) {
            throw new BoatException(
                "Invalid boat length: " + boatLength
                + ". Boat length must be between "
                + VehicleConstants.MINBOATLENGTH + " and "
                + VehicleConstants.MAXBOATLENGTH + "."
            );
        }

        this.boatLength = boatLength;
    }

    public void setPowerSource(PowerTypes powerSource) {
        this.powerSource = powerSource;
    }

    public PowerTypes getPowerSource() {
        return powerSource;
    }

    @Override
    public void go() {
        System.out.println("Boat is moving.");
    }

    @Override
    public void stop() {
        System.out.println("Boat has stopped.");
    }

    @Override
    public PowerTypes powerBy() {
        return getPowerSource();
    }

    @Override
    public String toString() {
        return "Boat [boatLength=" + getBoatLength()
                + ", powerSource=" + getPowerSource() + "]";
    }
}
