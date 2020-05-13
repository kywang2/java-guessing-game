import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Guessing Game!");
        int x=2;
        while (x>0) {
        System.out.println("Please enter a number between 1-10:");
            Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
            if (guess == 7) {
                System.out.println("Congratulations, you have won!");
                x = 0;
            } else if (guess >= 1 && guess <=6) {
                System.out.println("You lose! Guess is lower than the secret number!");
                x = x - 1;
            } else if (guess >= 8 && guess <=10) {
                System.out.println("You lose! Guess is higher than the secret number!");
                x = x - 1;
            } else if (guess == 0) {
                System.out.println("Here are instructions. Please enter a number between 1-10!");
                x = x - 1;
            } else {
                System.out.println("Application is exiting.");
                x = 0;
            }
        }
    }

}
