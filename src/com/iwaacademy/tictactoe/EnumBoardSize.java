package com.iwaacademy.tictactoe;

public enum EnumBoardSize {
    TABLERO3X3("Board 3X3", 3),
    TABLERO4X4("Board 4X4", 4);

    private String description;
    private int boardSize;

    EnumBoardSize(String description, int boardSize) {
        this.description = description;
        this.boardSize = boardSize;
    }

    public String getDescription() {
        return description;
    }

    public int getBoardSize() {return boardSize;}
}

