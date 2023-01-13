package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> salaryMap = new HashMap<>();

        salaryMap.put("Bob", 900);
        salaryMap.put("John", 920);
        //salaryMap.put("John", 1000);

        System.out.println(salaryMap);

        System.out.println("John salary: " + salaryMap.get("John"));

        System.out.println(salaryMap.keySet());
        System.out.println(salaryMap.size());
        salaryMap.remove("Bob");
        System.out.println(salaryMap);

        Map<String, String> capitals = new HashMap<>();
        capitals.put("Lithuania", "Vilnius");
        capitals.put("England", "London");
        capitals.put("Finland", "Helsinki");

        System.out.println(capitals.get("Finland"));

        for(Map.Entry<String,String> entry: capitals.entrySet()){
            System.out.println(entry.getKey() + " has a capital city of " + entry.getValue());
        }
    }
}
