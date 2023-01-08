package homeworks;

import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {

        //4 for loop with 2 of them nested

       Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the size of tree:");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            //spaces
            for (int j = 1; j < size - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //stem
        for (int k = 0; k < size - 1; k++) {
            System.out.print(" ");
        }
        System.out.print("#");


        /*teacher's solution

        for (int i = 0; i < size; i++) {
            //spaces
            for (int j = 0; j < size - 1 - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //stem
        for (int k = 0; k < size - 1; k++) {
            System.out.print(" ");
        }
        System.out.print("#");

        */
    }
}
