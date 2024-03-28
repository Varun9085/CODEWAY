import java.util.Random;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int minRange = 1;
            int maxRange = 100;
            int attempts = 0;
            int score = 0;
            boolean playAgain = true;

            System.out.println("Welcome to the Number Game!");

            while (playAgain) {
                int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
                System.out.println("I have generated a number between " + minRange + " and " + maxRange + ". Guess what it is:");

                int guess;
                boolean guessedCorrectly = false;

                while (!guessedCorrectly) {
                    guess = scanner.nextInt();
                    attempts++;

                    if (guess == randomNumber) {
                        System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
                        score++;
                        guessedCorrectly = true;
                    } else if (guess < randomNumber) {
                        System.out.println("Too low! Try again:");
                    } else {
                        System.out.println("Too high! Try again:");
                    }
                }

                System.out.println("Your current score: " + score);
                attempts = 0;

                System.out.println("Do you want to play again? (yes/no)");
                String playChoice = scanner.next();

                if (!playChoice.equalsIgnoreCase("yes")) {
                    playAgain = false;
                }
            }

            System.out.println("Thanks for playing!");
            scanner.close();
        }
    }


