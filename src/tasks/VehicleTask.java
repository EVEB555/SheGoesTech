package tasks;

import java.text.DecimalFormat;
import java.util.Scanner;

class Vehicle {
    private float fuel;
    private float fuelUsage;
    private int passengers;

    public Vehicle(float fuel, float fuelUsage, int passengers) {
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }

    public float maxDistance() {
        double increasedFuelUsage = (0.05 * passengers) * fuelUsage;
        return (float) ((fuel * 100) / (fuelUsage + increasedFuelUsage));
    }
}

public class VehicleTask {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Please enter number of liters in the fuel tank");
        float fuel = sc.nextFloat();

        System.out.println("Please enter basic fuel consumption per 100km");
        float fuelUsage = sc.nextFloat();

        System.out.println("Now please enter the number of passengers");
        int passengers = sc.nextInt();

        Vehicle vehicle = new Vehicle(fuel, fuelUsage, passengers);
        System.out.println("Your vehicle can drive " + df.format(vehicle.maxDistance()) + " km max");

    }
}
