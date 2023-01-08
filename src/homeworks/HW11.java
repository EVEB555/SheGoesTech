package homeworks;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(true) {
            System.out.println("Enter your personal number");
            String number = scanner.nextLine();

            Pattern pattern = Pattern.compile("[0-9]{6}-[0-9]{5}");
            Matcher matcher = pattern.matcher(number);

            boolean validPersonalNumber = matcher.matches();

            if (validPersonalNumber) {
                System.out.println("Your inputted personal number is valid.");
            } else {
                System.out.println("Your inputted personal number is not valid");
            }

            System.out.println("Do you want to check your personal number again? Y/N");
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("n")){
                break;
            }
        }
    }
}
