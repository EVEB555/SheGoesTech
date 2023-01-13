package collections;

import java.util.HashSet;

public class SetInterfaceExample {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Bob");
        names.add("Ana");
        names.add("Tom");
        names.add("Ana");

        System.out.println(names);

        names.remove("Bob");
        System.out.println(names);
        System.out.println(names.contains("Liam"));
        System.out.println(names.contains("Tom"));

        HashSet<Integer> intSet1 = new HashSet<>();
        intSet1.add(1);
        intSet1.add(2);
        intSet1.add(3);
        intSet1.add(4);

        System.out.println("intSet1: " + intSet1);

        HashSet<Integer> intSet2 = new HashSet<>();
        intSet2.add(5);
        intSet2.add(6);
        intSet2.add(7);
        intSet2.add(8);

        System.out.println("intSet1: " + intSet2);

        HashSet<Integer> union = new HashSet<>(intSet1);
        System.out.println("union before: " + union);
        union.addAll(intSet2);
        System.out.println("union after: " + union);

        HashSet<Integer> intersection = new HashSet<>(intSet1);
        intersection.retainAll(intSet2);
        System.out.println("intersection: " + intersection); //?????????


        //Find difference for intSet1
        HashSet<Integer> difference1 = new HashSet<>(intSet1);
        difference1.removeAll(intSet2);
        System.out.println("Difference intSet1: " + difference1);

        //Find difference for intSet2
        HashSet<Integer> difference2 = new HashSet<>(intSet2);
        difference1.removeAll(intSet1);
        System.out.println("Difference intSet1: " + difference2);


    }
}
