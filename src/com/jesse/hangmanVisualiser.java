package com.jesse;

public class hangmanVisualiser {
    public static void drawHangman(int l) {
        if(l == 8) {
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");

        }
        else if(l == 7) {
            System.out.println("|------");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");

        }
        else if(l == 6) {
            System.out.println("|------");
            System.out.println("|    O");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");

        }
        else if(l == 5) {
            System.out.println("|------");
            System.out.println("|    O");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");

        }
        else if(l == 4) {
            System.out.println("|------");
            System.out.println("|    O");
            System.out.println("|    |");
            System.out.println("|");
            System.out.println("|");

        }
        else if(l == 3) {
            System.out.println("|------");
            System.out.println("|    O");
            System.out.println("|   -|");
            System.out.println("|");
            System.out.println("|");

        }
        else if(l == 2) {
            System.out.println("|------");
            System.out.println("|    O");
            System.out.println("|   -|-");
            System.out.println("|");
            System.out.println("|");

        }
        else if(l == 1) {
            System.out.println("|------");
            System.out.println("|    O");
            System.out.println("|   -|-");
            System.out.println("|   /");
            System.out.println("|");

        }
        else{
            System.out.println("|------");
            System.out.println("|    O");
            System.out.println("|   -|-");
            System.out.println("|   /|");
            System.out.println("|");

        }
    }
}
