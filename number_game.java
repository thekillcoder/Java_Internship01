import java.util.Random;
import java.util.Scanner;

public class number_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        int numberOfGuesses = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

        while (!hasGuessedCorrectly) {
            System.out.print("Guess: ");
            int guess = scanner.nextInt();
            numberOfGuesses++;

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number in " + numberOfGuesses + " guesses.");
                hasGuessedCorrectly = true;
            } else if (guess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        scanner.close();
    }
}

