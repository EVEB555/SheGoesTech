package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float sum = 0;

        System.out.println("Please enter array size:");
        int arraySize = sc.nextInt();

        //declare array in a given size
        float storageArray[] = new float[arraySize];

        System.out.println("Please enter array elements one by one");

        for(int i = 0; i < storageArray.length; i++){
            System.out.println("Please enter grade number: " + (i+1));
            storageArray[i] = sc.nextFloat();
            sum += storageArray[i];
        }

        System.out.println("Avarage score: " + (sum/arraySize));
        System.out.println("There was passed " + arraySize + " values");
    }
}
