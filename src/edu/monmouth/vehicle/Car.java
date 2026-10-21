
package edu.monmouth.vehicle;

public class Car implements Vehicle {

    private int engineSize;
    private PowerTypes powerSource;

    public Car(PowerTypes powerSource, int engineSize)
            throws CarException {
        setPowerSource(powerSource);
        setEngineSize(engineSize);
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize)
            throws CarException {
        if (engineSize < VehicleConstants.MINENGINESIZE
                || engineSize > VehicleConstants.MAXENGINESIZE) {
            throw new CarException(
                "Invalid engine size: " + engineSize
                + ". Engine size must be between "
                + VehicleConstants.MINENGINESIZE + " and "
                + VehicleConstants.MAXENGINESIZE + "."
            );
        }

        this.engineSize = engineSize;
    }

    public void setPowerSource(PowerTypes powerSource) {
        this.powerSource = powerSource;
    }

    public PowerTypes getPowerSource() {
        return powerSource;
    }

    @Override
    public void go() {
        System.out.println("Car is going.");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped.");
    }

    @Override
    public PowerTypes powerBy() {
        return getPowerSource();
    }

    @Override
    public String toString() {
        return "Car [engineSize=" + getEngineSize()
                + ", powerSource=" + getPowerSource() + "]";
    }
}
