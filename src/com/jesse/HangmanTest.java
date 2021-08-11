package com.jesse;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class HangmanTest {

    @Test
    void printsGuessesTest() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);

        char[] guesses = "apple".toCharArray();
        boolean actual = Hangman.printsGuesses(guesses, true);
        assertTrue(actual);

        String actualOutput = baos.toString();
        assertEquals(" a p p l e", actualOutput);
    }

    @Test
    void wrongInputTest(){

    }
}