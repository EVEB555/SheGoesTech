import java.util.Scanner;

public class ifStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //if
        System.out.println("Enter a grade: ");
        int grade = scanner.nextInt();

        if(grade >= 6){
            System.out.println("Good job!");
        } else {
            System.out.println("Sorry, failed");
        }
    }
}
