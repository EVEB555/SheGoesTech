package basics;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = sc.nextLine();

        System.out.println("Please enter your score");
        float score = sc.nextFloat();

        if(score <= 40.0f) {
            System.out.println(name + " got :  <= 40%");
        } else if (score >= 40.0f && score <= 80.0f) {
            System.out.println(name + " got: 40% - 80%");
        } else {
            System.out.println(name + " got: <= 100%");
        }
    }
}
