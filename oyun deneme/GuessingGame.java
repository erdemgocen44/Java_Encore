import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Devinez le nombre (entre 1 et 100) :");
            int guess = input.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("Trop petit !");
            } else if (guess > numberToGuess) {
                System.out.println("Trop grand !");
            } else {
                System.out.println("Vous avez gagné ! Le nombre était " + numberToGuess);
                System.out.println("Vous avez mis " + numberOfTries + " essais pour gagner.");
                break;
            }
        }
    }
}