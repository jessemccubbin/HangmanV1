package com.jesse;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        File engmix = new File("engmix.txt");

        Scanner wordScanner = new Scanner(engmix);

        ArrayList<String> words = new ArrayList<>();
        while(wordScanner.hasNextLine()) {
            words.add(wordScanner.nextLine());
        }
        Scanner input = new Scanner(System.in);

        String secretChars = words.get((int)(Math.random() * words.size()));
        char[] wordList = secretChars.toCharArray();

        char[] guesses = new char[wordList.length];
        for(int i = 0; i < wordList.length; i++) {
            guesses[i] = '?';
        }
        boolean finished = false;
        while(true) {
            System.out.println("~~~~~~~~~~~~~~~~~~");

            String letter = input.next();

            while(letter.length() != 1 || Character.isDigit(letter.charAt(0))) {
                System.out.println("Wrong input, please try again");
                letter = input.next();
            }
        }

    }
}
