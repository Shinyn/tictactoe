package com.company;

import java.util.Scanner;

public class Main {
    private static Board game = new Board();
    private static char currentMark = 'X';
    private static Scanner sc = new Scanner(System.in);



    public static void main(String[] args) {
        System.out.println(" Three-in-a-Row \n X begins!");

        boolean currentGame = true;

        while (currentGame) {
            //En spelomgång
            game.print();
            playerMove();
            switchPlayer();
            game.checkWinner();
            game.isFull();
        }
    }

    public static void switchPlayer() {
        //Byter X till O och vice versa
        if (currentMark == 'X') {
            currentMark = 'O';
        } else if (currentMark == 'O') {
            currentMark = 'X';
        }
    }

    public static void playerMove() {
        String input = sc.nextLine();

        //Spelarens drag
        if (input.equals("a1")) {
            if (!game.isOccupied(0, 0)) {
                game.setMarker(0, 0, currentMark);
            } else {
                System.out.println("Space occupied");
                switchPlayer();
            }
        } else if (input.equals("a2")) {
            if (!game.isOccupied(0, 1)) {
                game.setMarker(0, 1, currentMark);
            } else {
                System.out.println("Space occupied");
                switchPlayer();
            }
        } else if (input.equals("a3")) {
            if (!game.isOccupied(0, 2)) {
                game.setMarker(0, 2, currentMark);
            } else {
                System.out.println("Space occupied");
                switchPlayer();
            }
        } else if (input.equals("b1")) {
            if (!game.isOccupied(1, 0)) {
                game.setMarker(1, 0, currentMark);
            } else {
                System.out.println("Space occupied");
                switchPlayer();
            }
        } else if (input.equals("b2")) {
            if (!game.isOccupied(1, 1)) {
                game.setMarker(1, 1, currentMark);
            } else {
                System.out.println("Space occupied");
                switchPlayer();
            }
        } else if (input.equals("b3")) {
            if (!game.isOccupied(1, 2)) {
                game.setMarker(1, 2, currentMark);
            } else {
                System.out.println("Space occupied");
                switchPlayer();
            }
        } else if (input.equals("c1")) {
            if (!game.isOccupied(2, 0)) {
                game.setMarker(2, 0, currentMark);
            } else {
                System.out.println("Space occupied");
                switchPlayer();
            }
        } else if (input.equals("c2")) {
            if (!game.isOccupied(2, 1)) {
                game.setMarker(2, 1, currentMark);
            } else {
                System.out.println("Space occupied");
                switchPlayer();
            }
        } else if (input.equals("c3")) {
            if (!game.isOccupied(2, 2)) {
                game.setMarker(2, 2, currentMark);
            } else {
                System.out.println("Space occupied");
                switchPlayer();
            }
        } else {
            switchPlayer();
            System.out.println("Ogiltigt drag");
        }
    }
}
