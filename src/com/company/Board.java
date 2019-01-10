package com.company;

public class Board {

    private char[][] field;

    private int p1Points = 0;
    private int p2Points = 0;

    public Board() {
        //Skapar ny tom spelplan
        this.field = new char[3][3];
        clear();
    }

    private void clear() {
        //Rensa brädet
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = ' ';
            }
        }
    }
    
    
    public void print() {
        //Skriv ut spelplan
        System.out.println("    1   2   3 \n" +
                "\n" +
                "a   " + field[0][0] + " | " + field[0][1] + " | " + field[0][2] + " \n" +
                "   ---+---+---\n" +
                "b   " + field[1][0] + " | " + field[1][1] + " | " + field[1][2] + " \n" +
                "   ---+---+---\n" +
                "c   " + field[2][0] + " | " + field[2][1] + " | " + field[2][2] + " \n");

        System.out.println("     Score: \n (X) " + p1Points + " - " + p2Points + " (O) ");

    }

    public boolean setMarker(int col, int row, char marker) {
        //Placera markör
        if (field[col][row] == ' ') {
            field[col][row] = marker;
        } else {
            System.out.println("Space occupied");
        }
        return true;
    }

    public void isFull() {
        //Är brädet fullt?
        if ((field[0][0] != ' ') && (field[0][1] != ' ') && (field[0][2] != ' ') && (field[1][0] != ' ') &&
                (field[1][1] != ' ') && (field[1][2] != ' ') && (field[2][0] != ' ') && (field[2][1] != ' ') &&
                (field[2][2] != ' ')) {
            System.out.println("It's a draw!");
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field.length; j++) {
                    field[i][j] = ' ';
                }
            }
        }
    }



    public boolean isOccupied(int col, int row) {
        //Är platsen tom?
        if(field[col][row] != ' ') {
            return true;
        }
        return false;
    }

    //================================================================================

    public void checkWinner() {
        checkWinner('X');
        checkWinner('O');
    }
    
    void checkWinner(char marker) {
        //Finns vinnare?
        if((field[0][0] == marker && field[0][1] == marker && field[0][2] == marker) ||
                (field[0][0] == marker && field[1][0] == marker && field[2][0] == marker) ||
                (field[1][0] == marker && field[1][1] == marker && field[1][2] == marker) ||
                (field[2][0] == marker && field[2][1] == marker && field[2][2] == marker) ||
                (field[0][0] == marker && field[1][1] == marker && field[2][2] == marker) ||
                (field[0][2] == marker && field[1][1] == marker && field[2][0] == marker) ||
                (field[0][1] == marker && field[1][1] == marker && field[2][1] == marker) ||
                (field[0][2] == marker && field[1][2] == marker && field[2][2] == marker)) {
            System.out.println(marker + " wins round");
            p1Points++;
            print();
            clear();
        }
        
    }
    
}
