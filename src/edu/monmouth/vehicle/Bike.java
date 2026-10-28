package edu.monmouth.vehicle;

public class Bike implements Vehicle{
	
	private int batteryHours;
    private PowerTypes powerSource;
	
	public Bike(PowerTypes powerSource, int batteryHours) {
		setPowerSource(powerSource);
        setBatteryHours(batteryHours);
	}
	
	public int getBatteryHours() {
        return batteryHours;
    }

    public void setBatteryHours(int batteryHours) {
    	this.batteryHours = batteryHours;
    }
	
	public void setPowerSource(PowerTypes powerSource) {
        this.powerSource = powerSource;
    }

    public PowerTypes getPowerSource() {
        return powerSource;
    }
	
	@Override
    public void go() {
        System.out.println("Bike is going.");
    }

    @Override
    public void stop() {
        System.out.println("Bike has stopped.");
    }

    @Override
    public PowerTypes powerBy() {
        return getPowerSource();
    }

    @Override
    public String toString() {
        return "Bike [batteryhours=" + getBatteryHours()
                + ", powerSource=" + getPowerSource() + "]";
    }

}
