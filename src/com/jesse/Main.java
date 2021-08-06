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

    }
}
