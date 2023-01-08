package tasks;

import java.util.Scanner;

class Game {
    private static String [] moves = {"rock", "paper", "scissors"};

    static boolean rockPaperScissors(String firstUserMove, String secondUserMove){
        return firstUserMove.equals(moves[0]) && secondUserMove.equals(moves[2])
                || (firstUserMove.equals(moves[2]) && secondUserMove.equals(moves[1]))
                || (firstUserMove.equals(moves[1]) && secondUserMove.equals(moves[0]));
    }
}

public class GameTask {
    public static void main(String[] args) {

        char again = 'y';

        while(again == 'y') {
            Scanner sc = new Scanner(System.in);

            System.out.println("This is a game 'Rock-Paper-Scissors'. Please enter first player's move:");

            String firstUserInput = sc.nextLine().toLowerCase();


            if (firstUserInput.equals("rock") || firstUserInput.equals("paper") || firstUserInput.equals("scissors")) {
                System.out.print("");
            } else {
                System.out.println("Wrong input. Reload the game.");
                break;
            }

            System.out.println("Please enter second player's move:");
            String secondUserInput = sc.nextLine().toLowerCase();

            if (secondUserInput.equals("rock") || secondUserInput.equals("paper") || secondUserInput.equals("scissors")) {
                System.out.print("");
            } else {
                System.out.println("Wrong input. Reload the game.");
                break;
            }

            if (firstUserInput.equals(secondUserInput)) {
                System.out.println("It's a tie!");
            } else if (Game.rockPaperScissors(firstUserInput, secondUserInput)) {
                System.out.println("First player won!");
            } else {
                System.out.println("Second player won!");
            }

            System.out.println("Do you want to play again? y (yes)/n (no)");
            again = sc.next().charAt(0);
            sc.nextLine();

            //destytojo variantas https://codeshare.io/yoRjbz
            //https://codeshare.io/N3vlQ8
        }

    }
}
