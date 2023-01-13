package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListInterfaceExample2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("List 1: " + list);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        list2.add(5);
        list2.add(6);
        list2.add(7);

        System.out.println("List 2: " + list2);
        ArrayList<String> array = new ArrayList<>();
        array.add("Hello");
        array.add("Bye");
        array.add("Cheers");

        for (int i = 0; i<array.size(); i ++){
            System.out.println(array.get(i) + " ");
        }

        for(String str: array){
            System.out.println(str + " ");
        }
        System.out.println();

        LinkedList<String> car = new LinkedList<>();
        car.add("Volvo");
        car.add("Audi");
        car.add("BMW");
        System.out.println(car);

        System.out.println(car.get(car.size() - 1));
        System.out.println(car.getLast());
        System.out.println(car.getFirst());

        LinkedList<Integer> intList = new LinkedList<>();

        for (int i = 1; i < 101; i++){
            intList.add(i);
        }
        System.out.println(intList);
    }
}
