package basics;

public class Operators {
    public static void main(String[] args) {

        //Assignment operators =, +=, -=, *=, /=

        int a = 100;
        System.out.println("a = " + a);

        a += 10;
        System.out.println("a = " + a);

        // Basic arithmetic operators

        //23 % 6 = 5 -> 18 telpa (6 po tris) ir lieka 5 (23 - 18)

        //Incrementation and decrementation

        //post incrementation
        int num1 = 10;
        num1++;
        System.out.println("num1 = " + num1);
        System.out.println("num1 = " + num1++); // first prints than changes
        System.out.println("num1 = " + num1);

        //pre incrementation/decrimentation
        System.out.println("num1 = " + --num1);
        System.out.println("num1 = " + ++num1); //changes and prints

        //4 ways to increase or decrease variable by one
        num1 += 1;
        num1 = num1 + 1;
        num1++;
        ++num1;

        //relational operators

        //ewuality ==
        int i = 1;
        int b = 10;
        System.out.println("Equality " + (i == b));

        //Inequality !=
        System.out.println("Inequality " + (i!=b));

        //greater than > and greater than or equal to >=
        System.out.println("greater than " + (i > b));
        System.out.println("greater than or equal to " + (i >= b));

        //less than < and less than or equal to
        System.out.println("greater than " + (i < b));
        System.out.println("greater than or equal to " + (i <= b));

        //logical operators
        //logical and - &&

        boolean sun = true;
        boolean dry = true;

        System.out.println(" I will go outside " + (sun && dry));

        //logical OR - ||

        boolean sale = false;
        boolean rich = true;

        System.out.println("I will buy iPhone " + (sale || rich));

    }
}
