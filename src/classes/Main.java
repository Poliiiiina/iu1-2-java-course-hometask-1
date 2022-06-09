package classes;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Lada Kalina", 80, 30);

        System.out.println(vehicle.getFuelAmountForDistance(120));
        System.out.println(vehicle.getTimeOfDistance(240));

    }
}
