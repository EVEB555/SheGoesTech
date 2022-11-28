package tasks;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a year");
        int input = sc.nextInt();
        //int input = 2101;

        if (input > 0) {
            if (input <=2100) {
                if(input % 4 == 0 && input % 100 != 0 || input % 400 == 0) {
                    System.out.println("It is a leap year");
                } else {
                    System.out.println("It is not a leap year");
                }
            } else {
                System.out.println("You are looking too far in the future, live for today.");
            }
        } else {
            System.out.println("Invalid input.");
        }

    }
}
