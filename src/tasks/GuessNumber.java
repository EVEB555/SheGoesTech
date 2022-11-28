package tasks;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter max random range");

        int rand, guess, max;

        max = sc.nextInt();
        rand = (int) (Math.random() * (max+1));
        System.out.println("Generated random value = " + rand);

        do{
            System.out.println("Guess the number");
            guess = sc.nextInt();

            if(guess < rand){
                System.out.println("Try bigger number");
            } else if (guess > rand){
                System.out.println("Try smaller number");
            }//else if needed in case when guess is equal to rand then it will continue
        }while(guess != rand);

        System.out.println("Congrats");
    }
}
