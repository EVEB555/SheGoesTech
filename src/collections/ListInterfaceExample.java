package collections;

import java.util.ArrayList;

public class ListInterfaceExample {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Volvo");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Jeep");
        cars.add("Mercedes");

        System.out.println(cars);

        System.out.println(cars.get(0));

        cars.add(2, "Toyota");
        System.out.println(cars);

        cars.set(3, "Ford");
        System.out.println(cars);

        cars.remove(3);
        System.out.println(cars);
        System.out.println(cars.size());
        cars.clear();

        System.out.println(cars);
    }
}
