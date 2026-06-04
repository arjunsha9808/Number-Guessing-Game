package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;  // 1 to 100
        int guess = 0;

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Guess a number between 1 to 100");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > numberToGuess) {
                System.out.println("Too High! try again.");
            } else if (guess < numberToGuess) {
                System.out.println("Too Low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
            }
        }
        sc.close();
    }
}