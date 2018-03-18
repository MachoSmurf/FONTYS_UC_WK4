package com.company;

import javafx.scene.chart.Chart;

import java.util.*;

public class Huffman {
    List<Knoop> frequentie;

    /*
    Opdracht 1a.
    */

    public List<Knoop> countChars(String input) {
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
        for (char c : charSet) {
            count = charToLookFor(input, c);
            frequentie.add(new Knoop(c, count));
        }

        return frequentie;
    }

    private int charToLookFor(String input, char charToLookFor) {
        int freq = 0;

        for (int i = 0; i < input.length(); i++) {
            if (charToLookFor == input.charAt(i)) {
                ++freq;
            }
        }

        return freq;
    }

    public PriorityQueue<Knoop> arrayToPriority(List<Knoop> frequentie) {
        KnoopComparator kc = new KnoopComparator();
        PriorityQueue<Knoop> freqPrio = new PriorityQueue<>(10, kc);

        for (int i = 0; i < frequentie.size(); i++) {
            freqPrio.add(frequentie.get(i));
        }
        return freqPrio;
    }

    public PriorityQueue<Knoop> buildTree(PriorityQueue<Knoop> freqPrio) {
        PriorityQueue<Knoop> result = freqPrio;
        Knoop knoop1 = result.poll();
        Knoop knoop2 = result.poll();

        Knoop knoop3 = new Knoop();
        knoop3.addChildren(knoop1, knoop2);
        knoop3.setCount(knoop3.getChildCount());
        result.add(knoop3);

        if (result.size() == 1) {
            return result;
        } else {
            return buildTree(result);
        }

    }
}