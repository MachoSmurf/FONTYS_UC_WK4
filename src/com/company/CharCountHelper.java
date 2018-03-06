package com.company;

public class CharCountHelper {
    private int count;
    private char character;

    public CharCountHelper(char character, int count){
        this.count = count;
        this.character = character;
    }

    public char getCharacter(){
        return this.character;
    }

    public int getCount(){
        return this.count;
    }
}
