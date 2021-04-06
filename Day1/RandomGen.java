//package java.ss.Day1;

import java.util.Random;
import java.util.Scanner;

public class RandomGen {

    public RandomGen() { 

        Scanner user = new Scanner(System.in);
        Random rand = new Random();

        final int num = rand.nextInt(100);
        int guess, count = 5;

        System.out.print("Guess the random number!\n(number will be between 0 - 100 inclusive): ");

        while (count > 0) {

            System.out.println("You have " + count + " number of guesses remaining");
            guess = user.nextInt();

            if (guess == num) {
                System.out.println("That's right!");
                break;
            } else if (Math.abs(num - guess) <= 10) {
                System.out.println("Your guess is within 10 digits to the random number");
                count--;
            } else {
                System.out.println("Incorrect!");
                count--;
            }
        }
        System.out.println("The random number was " + num + ".");
        user.close();
        System.exit(0);
    }

    public static void main(String[] args) {
        new RandomGen();
    }
}
