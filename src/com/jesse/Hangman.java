package com.jesse;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import static com.jesse.hangmanVisualiser.drawHangman;

public class Hangman {

    public static void main(String[] args) throws Exception {

        System.out.println("Enter your first letter to get started :)");

        File engmix = new File("C:/Users/UST-User/Desktop/HangmanV1/src/com/jesse/engmix.txt");
        Scanner wordScanner = new Scanner(engmix);
        ArrayList<String> words = new ArrayList<>();
        while (wordScanner.hasNextLine()) {
            words.add(wordScanner.nextLine());
        }
        Scanner input = new Scanner(System.in);

        String secretChars = words.get((int) (Math.random() * words.size()));
        char[] wordList = secretChars.toCharArray();

        char[] guesses = new char[wordList.length];
        for (int i = 0; i < wordList.length; i++) {
            guesses[i] = '?';
        }
        boolean finished = false;
        int lives = 8;

        while (!finished) {
            String letter = input.next();
            while (letter.length() != 1 || Character.isDigit(letter.charAt(0))) {
                System.out.println("Wrong input, please try again");
                letter = input.next();
            }

            boolean found = false;

            for (int i = 0; i < wordList.length; i++) {
                if (letter.charAt(0) == wordList[i]) {
                    guesses[i] = wordList[i];
                    found = true;
                }
            }

            if (!found) {
                lives--;
                System.out.println("Wrong letter");
            }

            boolean done = true;

            for (char guess : guesses) {
                if (guess == '?') {
                    System.out.print(" _");
                    done = false;
                } else {
                    System.out.print(" " + guess);
                }
            }
            System.out.println("\n" + "Lives left: " + lives);
            drawHangman(lives);

            if (done) {
                System.out.println("Congrats you finished, your word was " + secretChars + ". Great game!");
                System.out.println("Press Run to play again.");
                finished = true;
            }

            if (lives < 0) {
                System.out.println("You lost, your word was " + secretChars + ". Better luck next time");
                System.out.println("Press Run to play again.");
                finished = true;
            }
        }
    }
}
