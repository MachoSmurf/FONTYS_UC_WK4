package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class HuffmanTest {

    /*
    Opdracht 1a

     */
    @Test
    public void testCountChars_1() {
        System.out.println("testCountChars_1");
        Huffman huff = new Huffman();
        String testString1 = "Bananen";

        HashMap<Character, Integer> result1 = huff.countChars(testString1);

        HashMap<Character, Integer> expectedResult1 = new HashMap<Character, Integer>();
        expectedResult1.put('a', 2);
        expectedResult1.put('B', 1);
        expectedResult1.put('e', 1);
        expectedResult1.put('n', 3);

        // result1 en expectedResult gelijk
        Assert.assertTrue(result1.equals(expectedResult1));

        expectedResult1.clear();

        expectedResult1.put('a', 2);
        expectedResult1.put('B', 1);
        expectedResult1.put('e', 1);
        expectedResult1.put('n', 7);

        // result en expected result ongelijk
        Assert.assertTrue(!result1.equals(expectedResult1));
    }

    @Test
    public void testCountChars_2() {
        System.out.println("testCountChars_2");
        Huffman huff = new Huffman();
        String testString2 = "Laptop";

        HashMap<Character, Integer> result2 = huff.countChars(testString2);

        HashMap<Character, Integer> expectedResult2 = new HashMap<Character, Integer>();
        expectedResult2.put('L', 1);
        expectedResult2.put('a', 1);
        expectedResult2.put('p', 2);
        expectedResult2.put('t', 1);
        expectedResult2.put('o', 1);

        // result en expected result gelijk
        Assert.assertTrue(result2.equals(expectedResult2));

        expectedResult2.clear();

        expectedResult2.put('L', 1);
        expectedResult2.put('a', 1);
        expectedResult2.put('p', 2);
        expectedResult2.put('t', 1);
        expectedResult2.put('o', 1);

        // result en expected result ongelijk
        Assert.assertTrue(!result2.equals(expectedResult2));
    }

    @Test
    public void testCountChars_3() {
        System.out.println("testCountChars_3");
        Huffman huff = new Huffman();
        String testString3 = "Vliegtuig";

        HashMap<Character, Integer> result3 = huff.countChars(testString3);

        HashMap<Character, Integer> expectedResult3 = new HashMap<Character, Integer>();
        expectedResult3.put('V', 1);
        expectedResult3.put('l', 1);
        expectedResult3.put('i', 2);
        expectedResult3.put('e', 1);
        expectedResult3.put('g', 2);
        expectedResult3.put('t', 1);
        expectedResult3.put('u', 1);

        // result en expectedResult gelijk
        Assert.assertTrue(result3.equals(expectedResult3));

        expectedResult3.clear();
        expectedResult3.put('V', 1);
        expectedResult3.put('l', 1);
        expectedResult3.put('i', 2);
        expectedResult3.put('e', 1);
        expectedResult3.put('g', 2);
        expectedResult3.put('t', 1);
        expectedResult3.put('u', 5);

        // result en expected result ongelijk
        Assert.assertTrue(!result3.equals(expectedResult3));
    }

    /*
    Einde opdracht 1a.
     */
}