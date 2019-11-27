package hw.hw1;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Random random = new Random();
        int numberToGuess = random.nextInt(100);
        Scanner input = new Scanner(System.in);
        int guess;
        boolean isCorrect = false;

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Let the game begin!");

        System.out.println("Guess a number between 1 and 100: ");

        while (!isCorrect) {

            guess = input.nextInt();

            if (guess == numberToGuess) {
                isCorrect = true;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too small. Please try again..");
            } else
                System.out.println("Your guess is too big. Please try again..");
        }


        System.out.println("Congratulations," + name + "!");
    }

}

