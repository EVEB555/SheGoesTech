package oop;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

       /* System.out.println("Hello world");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = sc.nextLine();
        printName(name);
        printName("Lisa");*/

        String text = greetings("Bob");
        System.out.println(text);

        personInfo("John", 45);

        System.out.println(sum(1, 2, 3));
    }

    public static void printName(String name){
        System.out.println("Hello your name is " + name);
    }

    public static String greetings(String name){
        String result = "Hi " + name;
        return result;
    }

    public static void personInfo(String name, int age){
        System.out.printf("Your name is %s and you are %d years old\n", name, age);
    }

    public static int sum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
}
