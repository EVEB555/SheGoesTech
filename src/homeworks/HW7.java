package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Please enter array size:");
        int arraySize = sc.nextInt();

        //declare array in a given size
        int storageArray[] = new int[arraySize];

        System.out.println("Please enter array elements one by one");

        for(int i = 0; i < storageArray.length; i++){
            System.out.println("Please enter element number: " + (i+1));
            storageArray[i] = sc.nextInt();
            sum += storageArray[i];
        }

        System.out.println(Arrays.toString(storageArray));
    }
}
