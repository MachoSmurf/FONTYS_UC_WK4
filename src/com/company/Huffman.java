package com.company;

import javafx.scene.chart.Chart;

import java.util.*;

public class Huffman {
    List<CharCountHelper> frequentie;

    /*
    Opdracht 1a.


    */

    public List<CharCountHelper> countChars(String input){
        int count;
        frequentie = new ArrayList<CharCountHelper>();

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
            frequentie.add(new CharCountHelper(c, count));
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




    /*
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
    */

    /*
    Opdracht 2a
    2c Met de comparator geef je aan waarop gesorteerd moet worden.
    Voor deze opdracht is gekozen voor een LinkedHashMap omdat je hierin de Character en aantal eenvoudig in kan plaaten.
    Met PriorityQueue is dit mogelijk.
     */


    /*
    public HashMap sortByValues(HashMap map) {
        List list = new LinkedList(map.entrySet());

        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue())
                        .compareTo(((Map.Entry) (o2)).getValue());
            }
        });
*/
        /* De gesorteerde LinkedList kopiëren naar een LinkedHashMap.
           Hiervoor gekozen om de invoer volgorde te behouden. Wanneer dit niet gebruikt zou worden heb je een ongesorteerde HashMap.
         */
        /*
        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext(); ) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
        */
}