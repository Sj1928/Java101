import java.util.Random;
import java.util.Scanner;

public class GuesstheNumber {
    public static void main(String[] args) {
        //to welcome
        System.out.println("Welcome To GameON");

        // to ask details
        System.out.println("Enter Your name : ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello " + userName);

        //ask to start
        System.out.println("Shall We Begin?");
        System.out.println("\t1. Yes");
        System.out.println("\t2. No");

        int beginAnswer = scanner.nextInt();

        while (beginAnswer != 1) {
            System.out.println("Shall We Begin?");
            System.out.println("\t1. Yes");
            System.out.println("\t2. No");

            beginAnswer = scanner.nextInt();
        }

//random no generation
        Random random = new Random();
        int x = random.nextInt(10) + 1;

// user input
        System.out.println("Please guess an Number between 0 to 10");
        int userInput;
        userInput = scanner.nextInt();

        int timesTried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        while (!shouldFinish) {
            timesTried++;


            if (timesTried < 5) {
                if (userInput == x) {
                    hasWon = true;
                    shouldFinish = true;

                } else if (userInput > x) {
                    System.out.println("Guess Low");
                    userInput = scanner.nextInt();
                } else {
                    System.out.println("Guess High");
                    userInput = scanner.nextInt();
                }


            } else {
                shouldFinish = true;
            }

        }

//result

    }
}