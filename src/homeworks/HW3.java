package homeworks;

import java.util.Scanner;

public class HW3 {
    /*      Write an application, that will read one number from user (of type int)
        and check, if given number is "near" 100. A number is "near" 100 when
        difference between it and 100 is no bigger than 10.

        Your application should read one number (int) and print false or true on the screen,
        according to instructions above.*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();

        //#1

        if (number >= 90 && number <=110) {
            System.out.println(true);
        } else if (number >= 0 && number < 90){
            System.out.println(false);
        } else {
            System.out.println("Number cannot be negative or greater than 110");
        }

        //#2

        int diff = Math.abs(100 - number);

        if(diff <= 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //#3

        System.out.println(Math.abs(100 - number) <= 10);
    }


}
