package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        // reading a name
        String yourName = scanner.next();

        System.out.println("What a great name you have, " + yourName + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        // reading all remainders
        
        //String[] ageStrArr = ageString.split(" ");
        String[] ageStrArr = new String[3];
        ageStrArr[0] = scanner.next();
        ageStrArr[1] = scanner.next();
        ageStrArr[2] = scanner.next();

        int age = (Integer.parseInt(ageStrArr[0]) * 70 + Integer.parseInt(ageStrArr[1]) * 21 + Integer.parseInt(ageStrArr[2]) * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }
}
