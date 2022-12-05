package basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        String[][] dreamCars = new String[2][5];

        dreamCars[0][0] = "Audi";
        dreamCars[0][1] = "Bmw";
        dreamCars[0][2] = "Opel";
        dreamCars[0][3] = "Mercedes";
        dreamCars[0][4] = "Subaru";

        dreamCars[1][0] = "Toyota";
        dreamCars[1][1] = "Ferrari";
        dreamCars[1][2] = "Lexus";
        dreamCars[1][3] = "Aston Martin";
        dreamCars[1][4] = "Renault";


        for(int i = 0; i < dreamCars.length; i++) {
            for(int j = 0; j < dreamCars[i].length; j++){
                System.out.println(dreamCars[i][j]);
            }
        }

        //same with for each loop

        for (String [] group : dreamCars){
            for(String car: group)
            System.out.println(car);
        }

       /* for (String [] group : dreamCars){
            System.out.println(Arrays.toString(group));
        }*/


    }
}
