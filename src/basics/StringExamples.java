package basics;

import java.util.Scanner;

public class StringExamples {
    public static void main(String[] args) {

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");

        String name = sc.nextLine().toUpperCase().trim();

        System.out.println("Your name is " + name);

        if(name.equals("BOB")) {
            System.out.println("Your name is Bob");
        } else {
            System.out.println("You are not Bob");
        }*/

        String text1 = "This is";
        String text2 = " new text";

        String result = text1.concat(text2);

        System.out.println(result);
        System.out.println(result.length());

        System.out.println(result.indexOf("is")); // returns index where word starts

        String greetings = "This is holiday time. Have a nice holiday";
        System.out.println(greetings.replaceAll("holiday", "Christmas"));
        System.out.println(greetings.replaceFirst("holiday", "Christmas"));
        System.out.println(result.charAt(8));

        String introduction = "My name is Bob and I'm 30";
        System.out.println(introduction.substring(3));
        System.out.println(introduction.substring(3, 7));
        String bobsAge = introduction.substring(introduction.length()-2);
        System.out.println(bobsAge);

        //wrapper class
        int bobsAgeAsInteger = Integer.parseInt(bobsAge);

        if(bobsAgeAsInteger >= 18){
            System.out.println("Adult");
        } else {
            System.out.println("Child");
        }


        String intStrValue = "1";
        String floatStrValue = "2.0";
        String doubleStrValue = "2.3434343434";
        String booleanStrValue = "true";
        String longStrValue = "100000000000000";

        int intValue = Integer.parseInt(intStrValue);
        double doubleValue = Double.parseDouble(doubleStrValue);
        float floatValue = Float.parseFloat(floatStrValue);
        boolean booleanValue = Boolean.parseBoolean(booleanStrValue);
        long longValue = Long.parseLong(longStrValue);

    }
}
