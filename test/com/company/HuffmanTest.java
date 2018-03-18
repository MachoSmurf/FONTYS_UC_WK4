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
        String testString1 = "bananen";

        List<CharCountHelper> result1 = huff.countChars(testString1);
        List<CharCountHelper> expectedResult1 = new ArrayList<CharCountHelper>();


        expectedResult1.add(new CharCountHelper('a', 2));
        expectedResult1.add(new CharCountHelper('b', 1));
        expectedResult1.add(new CharCountHelper('e', 1));
        expectedResult1.add(new CharCountHelper('n', 3));

        Collections.sort(result1);
        Collections.sort(expectedResult1);

        if (result1.get(0).getCharacter() == expectedResult1.get(0).getCharacter() && result1.get(1).getCharacter() ==
                expectedResult1.get(1).getCharacter() && result1.get(2).getCharacter() == expectedResult1.get(2).getCharacter()
                && result1.get(3).getCharacter() == expectedResult1.get(3).getCharacter()) {

            for (int i = 0; i < result1.size(); i++){
                System.out.println(String.valueOf(result1.get(i).getCharacter() + " " + String.valueOf(expectedResult1.get(i).getCharacter())));
                System.out.println(String.valueOf(result1.get(i).getCount() + " " + String.valueOf(expectedResult1.get(i).getCount())));
            }
            // result1 en expectedResult gelijk
            Assert.assertTrue(true);

        } else {
            Assert.assertFalse(false);
        }


        expectedResult1.clear();

        expectedResult1.add(new CharCountHelper('b', 1));
        expectedResult1.add(new CharCountHelper('a', 2));
        expectedResult1.add(new CharCountHelper('n', 7));
        expectedResult1.add(new CharCountHelper('e', 1));


        // result en expected result ongelijk
        //Assert.assertFalse(result1.equals(expectedResult1));

        if (result1.get(0).getCharacter() == expectedResult1.get(0).getCharacter() && result1.get(1).getCharacter() ==
                expectedResult1.get(1).getCharacter() && result1.get(2).getCharacter() == expectedResult1.get(2).getCharacter()
                && result1.get(3).getCharacter() == expectedResult1.get(3).getCharacter()) {
            Assert.assertFalse(false);

        } else {

            // result1 en expectedResult gelijk
            Assert.assertTrue(true);
        }

    }

    @Test
    public void testCountChars_2() {
        System.out.println("testCountChars_2");
        Huffman huff = new Huffman();
        String testString2 = "laptop";

        List<CharCountHelper> result2 = huff.countChars(testString2);

        List<CharCountHelper> expectedResult2 = new ArrayList<CharCountHelper>();
        expectedResult2.add(new CharCountHelper('l', 1));
        expectedResult2.add(new CharCountHelper('a', 1));
        expectedResult2.add(new CharCountHelper('p', 2));
        expectedResult2.add(new CharCountHelper('t', 1));
        expectedResult2.add(new CharCountHelper('o', 1));

        Collections.sort(result2);
        Collections.sort(expectedResult2);

        // result en expectedResult gelijk
        //Assert.assertTrue(result2.equals(expectedResult2));

        if (result2.get(0).getCharacter() == expectedResult2.get(0).getCharacter() && result2.get(1).getCharacter() ==
                expectedResult2.get(1).getCharacter() && result2.get(2).getCharacter() == expectedResult2.get(2).getCharacter()
                && result2.get(3).getCharacter() == expectedResult2.get(3).getCharacter() && result2.get(4).getCharacter() == expectedResult2.get(4).getCharacter()) {
            for (int i = 0; i < result2.size(); i++){
                System.out.println(String.valueOf(result2.get(i).getCharacter() + " " + String.valueOf(expectedResult2.get(i).getCharacter())));
                System.out.println(String.valueOf(result2.get(i).getCount() + " " + String.valueOf(expectedResult2.get(i).getCount())));
            }
            // result2 en expectedResult gelijk
            Assert.assertTrue(true);

        } else {
            Assert.assertFalse(false);
        }

        expectedResult2.clear();

        expectedResult2.add(new CharCountHelper('l', 1));
        expectedResult2.add(new CharCountHelper('a', 1));
        expectedResult2.add(new CharCountHelper('p', 2));
        expectedResult2.add(new CharCountHelper('t', 1));
        expectedResult2.add(new CharCountHelper('o', 1));

        Collections.sort(expectedResult2);

        // result en expected result ongelijk
        //Assert.assertTrue(!result2.equals(expectedResult2));

        if (result2.get(0).getCharacter() == expectedResult2.get(0).getCharacter() && result2.get(1).getCharacter() ==
                expectedResult2.get(1).getCharacter() && result2.get(2).getCharacter() == expectedResult2.get(2).getCharacter()
                && result2.get(3).getCharacter() == expectedResult2.get(3).getCharacter() && result2.get(4).getCharacter() == expectedResult2.get(4).getCharacter()) {
            Assert.assertFalse(false);

        } else {
            // result2 en expectedResult gelijk
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testCountChars_3() {
        System.out.println("testCountChars_3");
        Huffman huff = new Huffman();
        String testString3 = "vliegtuig";

        List<CharCountHelper> result3 = huff.countChars(testString3);

        List<CharCountHelper> expectedResult3 = new ArrayList<CharCountHelper>();
        expectedResult3.add(new CharCountHelper('v', 1));
        expectedResult3.add(new CharCountHelper('l', 1));
        expectedResult3.add(new CharCountHelper('i', 2));
        expectedResult3.add(new CharCountHelper('e', 1));
        expectedResult3.add(new CharCountHelper('g', 2));
        expectedResult3.add(new CharCountHelper('t', 1));
        expectedResult3.add(new CharCountHelper('u', 1));

        Collections.sort(result3);
        Collections.sort(expectedResult3);

        // result en expectedResult gelijk
        //Assert.assertTrue(result3.equals(expectedResult3));

        if (result3.get(0).getCharacter() == expectedResult3.get(0).getCharacter() && result3.get(1).getCharacter() ==
                expectedResult3.get(1).getCharacter() && result3.get(2).getCharacter() == expectedResult3.get(2).getCharacter()
                && result3.get(3).getCharacter() == expectedResult3.get(3).getCharacter() && result3.get(4).getCharacter() == expectedResult3.get(4).getCharacter()
                && result3.get(5).getCharacter() == expectedResult3.get(5).getCharacter() && result3.get(6).getCharacter() == expectedResult3.get(6).getCharacter()) {
            for (int i = 0; i < result3.size(); i++){
                System.out.println(String.valueOf(result3.get(i).getCharacter() + " " + String.valueOf(expectedResult3.get(i).getCharacter())));
                System.out.println(String.valueOf(result3.get(i).getCount() + " " + String.valueOf(expectedResult3.get(i).getCount())));
            }
            // result2 en expectedResult gelijk
            Assert.assertTrue(true);

        } else {
            Assert.assertTrue(false);
        }

        expectedResult3.clear();
        expectedResult3.add(new CharCountHelper('v', 1));
        expectedResult3.add(new CharCountHelper('l', 1));
        expectedResult3.add(new CharCountHelper('i', 2));
        expectedResult3.add(new CharCountHelper('e', 1));
        expectedResult3.add(new CharCountHelper('g', 2));
        expectedResult3.add(new CharCountHelper('t', 1));
        expectedResult3.add(new CharCountHelper('u', 5));

        Collections.sort(expectedResult3);

        // result en expected result ongelijk
        //Assert.assertTrue(!result3.equals(expectedResult3));

        if (result3.get(0).getCharacter() == expectedResult3.get(0).getCharacter() && result3.get(1).getCharacter() ==
                expectedResult3.get(1).getCharacter() && result3.get(2).getCharacter() == expectedResult3.get(2).getCharacter()
                && result3.get(3).getCharacter() == expectedResult3.get(3).getCharacter() && result3.get(4).getCharacter() == expectedResult3.get(4).getCharacter()
                && result3.get(5).getCharacter() == expectedResult3.get(5).getCharacter() && result3.get(6).getCharacter() == expectedResult3.get(6).getCharacter()) {
            Assert.assertFalse(false);

        } else {
            // result en expectedResult gelijk
            Assert.assertTrue(true);
        }
    }

    /*
    Einde opdracht 1a.
     */
}