package com.company;

import javafx.scene.chart.Chart;

import java.util.*;

public class Huffman {
    List<Knoop> frequentie;

    /*
    Opdracht 1a.
    */

    public List<Knoop> countChars(String input){
        int count;
        frequentie = new ArrayList<Knoop>();

        char[] charArr = input.toCharArray();

        /*  Dubbele waardes uit de input string halen door gebruik te maken van een Set
            Een Set kan namelijk geen dubbele waarden bevatten
         */
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : charArr) {
            charSet.add(c);
        }

        // Per char tellen hoe vaak hij voor komt en een nieuw object toevoegen aan de lijst
        for (char c : charSet){
            count = charToLookFor(input, c);
            frequentie.add(new Knoop(c, count));
        }

        return frequentie;
    }

    private int charToLookFor(String input, char charToLookFor){
        int freq = 0;

        for(int i = 0; i < input.length(); i++) {
            if(charToLookFor == input.charAt(i)) {
                ++freq;
            }
        }

        return freq;
    }
}