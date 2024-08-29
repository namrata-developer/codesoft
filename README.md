# codesoft
//number guessing game in java
//Here's a Java program that incorporates the following features:

/*1.Random Number Generation: Generates a random number between 1 and 100.
2.Guessing Attempts: Limits the number of attempts the user has to guess the number.
3.Multiple Rounds: Allows the user to play multiple rounds.
4.Score Display: Displays the score based on the number of attempts taken to guess the number correctly.*/
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain;
        do {
            // Generate a random number between 1 and 100
            int targetNumber = random.nextInt(100) + 1;
            int maxAttempts = 5; // Maximum number of attempts
            int attempts = 0;
            boolean numberGuessed = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("Guess the number between 1 and 100. You have " + maxAttempts + " attempts.");

            // Loop until the user guesses the number or runs out of attempts
            while (attempts < maxAttempts) {
                attempts++;
                System.out.print("Attempt " + attempts + ": Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number.");
                    numberGuessed = true;
                    break;
                }
            }

            if (!numberGuessed) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + targetNumber + ".");
            }

            // Display the score based on the number of attempts
            if (numberGuessed) {
                System.out.println("Your score: " + (maxAttempts - attempts + 1) + " points.");
            } else {
                System.out.println("Your score: 0 points.");
            }

            // Ask the user if they want to play again
            System.out.print("Do you want to play another round? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("Thank you for playing! Goodbye.");
        scanner.close();
    }
}
