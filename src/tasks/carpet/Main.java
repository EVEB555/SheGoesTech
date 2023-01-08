package tasks.carpet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter floor length");
        double lenght = scanner.nextDouble();

        System.out.println("Please enter floor width");
        double width = scanner.nextDouble();

        Floor floor = new Floor(lenght, width);

        System.out.println("Floor m2 = " + floor.getArea());

        System.out.println("Please enter carpet price per m2");

        double carpetCost = scanner.nextDouble();

        Carpet carpet = new Carpet(carpetCost);

        Calculator calculator = new Calculator(floor, carpet);

        System.out.println("Carpet cost: " + calculator.getTotalCoast() + " Eur");
    }
}
