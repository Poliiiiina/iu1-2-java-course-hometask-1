package classes;


public class Vehicle {
    public String model;

    public int averageVelocity;

    public int fuelConsumption;

    public Vehicle(String model, int averageVelocity, int fuelConsumption) {
        this.model = model;
        this.averageVelocity = averageVelocity;
        this.fuelConsumption = fuelConsumption;
    }

    public double getTimeOfDistance(double distance) {
        return distance / averageVelocity;
    }

    public double getFuelAmountForDistance(double distance) {
        return fuelConsumption * distance / 100;
    }

}
