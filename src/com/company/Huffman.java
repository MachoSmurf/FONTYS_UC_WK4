package com.company;

import java.util.HashMap;

public class Huffman {
    HashMap<Character, Integer> frequentie;

    /*
    Opdracht 1a.
    Gekozen voor de Hashmap collection omdat hier op een eenvoudige manier de character en het aantal ingezet konden worden.
    Bij de Hashmap kan je ook op een eenvoudige manier de value van de map ophogen. Bij gebruik van een ArrayList bijv. heb je die mogelijkheid niet.

    */
    public HashMap<Character, Integer> countChars(String input) {

        frequentie = new HashMap<Character, Integer>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            Integer val = frequentie.get(c);
            if (val != null) {
                frequentie.put(c, new Integer(val + 1));
            } else {
                frequentie.put(c, 1);
            }
        }

        return frequentie;
    }
}
