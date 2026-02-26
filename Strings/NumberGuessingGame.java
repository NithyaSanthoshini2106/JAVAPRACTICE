



import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;

        System.out.println("=== Welcome to Number Guessing Game ===");

        while (playAgain) {

            int randomNumber = rand.nextInt(100) + 1;
            int attempts = 0;
            int guess = 0;

            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("You have 7 attempts to guess it!");

            while (attempts < 7) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess == randomNumber) {
                    System.out.println(attempts );
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (guess != randomNumber) {
                System.out.println(randomNumber);
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            String response = sc.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
        sc.close();
    }
}