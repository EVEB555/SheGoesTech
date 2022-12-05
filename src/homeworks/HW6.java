package homeworks;

public class HW6 {
    /*        Write an application, that will print the full latin alphabet
        (upper case letters) in alphabetical order. Each letter should be printed in new line.*/

    public static void main(String[] args) {


        for(int i = 65; i < 91; i++){
            //System.out.println((char)i); //new row
            System.out.print((char) i + " "); // same row
        }

        System.out.println();

        for  (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
    }
}
