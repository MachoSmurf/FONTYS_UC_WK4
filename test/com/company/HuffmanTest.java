package com.company;

import com.sun.deploy.util.ArrayUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

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

        List<CharCountHelper> result1 = huff.countChars(testString1);
        List<CharCountHelper> expectedResult1 = new ArrayList<CharCountHelper>();


        expectedResult1.add(new CharCountHelper('a', 2));
        expectedResult1.add(new CharCountHelper('B', 1));
        expectedResult1.add(new CharCountHelper('e', 1));
        expectedResult1.add(new CharCountHelper('n', 3));

        Collections.sort(result1);
        Collections.sort(expectedResult1);

        // result1 en expectedResult gelijk
        Assert.assertTrue(result1.equals(expectedResult1));

//        expectedResult1.clear();
//
//        expectedResult1.add(new CharCountHelper('B', 1));
//        expectedResult1.add(new CharCountHelper('a', 2));
//        expectedResult1.add(new CharCountHelper('n', 7));
//        expectedResult1.add(new CharCountHelper('e', 1));
//
//
//        // result en expected result ongelijk
//        Assert.assertFalse(result1.containsAll(expectedResult1));
    }

    @Test
    public void testCountChars_2() {
        System.out.println("testCountChars_2");
        Huffman huff = new Huffman();
        String testString2 = "Laptop";

        List<CharCountHelper> result2 = huff.countChars(testString2);

        List<CharCountHelper> expectedResult2 = new ArrayList<CharCountHelper>();
        expectedResult2.add(new CharCountHelper('L', 1));
        expectedResult2.add(new CharCountHelper('a', 1));
        expectedResult2.add(new CharCountHelper('p', 2));
        expectedResult2.add(new CharCountHelper('t', 1));
        expectedResult2.add(new CharCountHelper('o', 1));

        // result en expected result gelijk
        Assert.assertTrue(result2.equals(expectedResult2));

        expectedResult2.clear();

        expectedResult2.add(new CharCountHelper('L', 1));
        expectedResult2.add(new CharCountHelper('a', 1));
        expectedResult2.add(new CharCountHelper('p', 2));
        expectedResult2.add(new CharCountHelper('t', 1));
        expectedResult2.add(new CharCountHelper('o', 1));

        // result en expected result ongelijk
        Assert.assertTrue(!result2.equals(expectedResult2));
    }

    @Test
    public void testCountChars_3() {
        System.out.println("testCountChars_3");
        Huffman huff = new Huffman();
        String testString3 = "Vliegtuig";

        List<CharCountHelper> result3 = huff.countChars(testString3);

        List<CharCountHelper> expectedResult3 = new ArrayList<CharCountHelper>();
        expectedResult3.add(new CharCountHelper('V', 1));
        expectedResult3.add(new CharCountHelper('l', 1));
        expectedResult3.add(new CharCountHelper('i', 2));
        expectedResult3.add(new CharCountHelper('e', 1));
        expectedResult3.add(new CharCountHelper('g', 2));
        expectedResult3.add(new CharCountHelper('t', 1));
        expectedResult3.add(new CharCountHelper('u', 1));

        // result en expectedResult gelijk
        Assert.assertTrue(result3.equals(expectedResult3));

        expectedResult3.clear();
        expectedResult3.add(new CharCountHelper('V', 1));
        expectedResult3.add(new CharCountHelper('l', 1));
        expectedResult3.add(new CharCountHelper('i', 2));
        expectedResult3.add(new CharCountHelper('e', 1));
        expectedResult3.add(new CharCountHelper('g', 2));
        expectedResult3.add(new CharCountHelper('t', 1));
        expectedResult3.add(new CharCountHelper('u', 5));

        // result en expected result ongelijk
        Assert.assertTrue(!result3.equals(expectedResult3));
    }

    /*
    Einde opdracht 1a.
     */
}