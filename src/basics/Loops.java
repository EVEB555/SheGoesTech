package basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }

        int i = 1;
        while (i <= 10) {
            System.out.println("This is while loop");
            i++;
        }

        i = 0;
        do {
            System.out.println("This is do-while loop");
            i++;
        } while (i <= 10);

        int input;

        do{
            System.out.println("Please enter number");
            input = sc.nextInt();
            System.out.println(input * 2);
        }while (input != 0);
    }
}
