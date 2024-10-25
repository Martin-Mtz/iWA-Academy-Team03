package com.iwaacademy.tictactoe;

public abstract class Game {

    public abstract int[] getPlayerMove(char currentPlayer);

    public abstract boolean isWinner(int size);
}
