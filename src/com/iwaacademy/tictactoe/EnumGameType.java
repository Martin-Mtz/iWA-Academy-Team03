package com.iwaacademy.tictactoe;

public enum EnumGameType {
    GAME01("Normal Game ",1),
    GAME02("Inverted Game ",2);

    private String descriptionGameType;
    private int valueGameType;

    private EnumGameType(String descriptionGameType, int valueGameType) {
        this.descriptionGameType = descriptionGameType;
        this.valueGameType = valueGameType;
    }

    public String getDescriptionGameType() {
        return descriptionGameType;
    }

    public int getValueGameType() {
        return valueGameType;
    }
}
