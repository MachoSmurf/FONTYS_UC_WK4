package com.company;

public class Knoop implements Comparable {
    private int count;
    private char character;
    private Knoop leftchild, rightchild;

    public Knoop() {

    }

    public Knoop(char character, int count) {
        this.count = count;
        this.character = character;
    }

    public char getCharacter() {
        return this.character;
    }

    public int getCount() {
        return this.count;
    }

    public int getChildCount() {
        return leftchild.count + rightchild.count;
    }

    public void setCount(int count){
        this.count = count;
    }

    // opdracht 2
    @Override
    public int compareTo(Object o) {
        if (o == null) {
            throw new NullPointerException();
        } else {
            Knoop cch = (Knoop) o;
            return this.count - cch.count;
        }

    }

    public void addKnoop(Knoop knoop1, Knoop knoop2) {



    }

    public void addChildren(Knoop leftchild, Knoop rightchild) {
        this.leftchild = leftchild;
        this.rightchild = rightchild;
    }
}
