package com.company;

public class CharCountHelper implements Comparable {
    private int count;
    private char character;

    public CharCountHelper(char character, int count) {
        this.count = count;
        this.character = character;
    }

    public char getCharacter() {
        return this.character;
    }

    public int getCount() {
        return this.count;
    }

    @Override
    public int compareTo(Object o) {
        if (o == null) {
            throw new NullPointerException();
        }
        else{
            CharCountHelper cch = (CharCountHelper) o;
            return this.count - cch.count;
        }

    }
}
