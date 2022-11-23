package homeworks;

import java.util.Scanner;

public class HW4 {
    /*     Write an application, that will read two numbers from user
        (of type int) and will print true, if both numbers are the
        same sign (both are positive, or both are negative), or false
        otherwise.

        If at least one of given numbers is equal to 0, your application
        should print false.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int number1 = sc.nextInt();

        System.out.println("Please enter second number: ");
        int number2 = sc.nextInt();

        if (number1 < 0 && number2 < 0 || number1 > 0 && number2 > 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }



}
