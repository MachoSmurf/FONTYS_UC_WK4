package com.company;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class HuffmanTest {

    @Test
    public void testCountChars(){
        Huffman huff = new Huffman();
        String testString1 = "Bananen";
        String testString2 = "Laptop";
        String testString3 = "Vliegtuig";

        List<CharCountHelper> result1 = huff.countChars(testString1);
        List<CharCountHelper> result2 = huff.countChars(testString2);
        List<CharCountHelper> result3 = huff.countChars(testString3);

        List<CharCountHelper> expectedResult1 = new ArrayList<>();
        expectedResult1.add(new CharCountHelper('a', 2));
        expectedResult1.add(new CharCountHelper('B', 1));
        expectedResult1.add(new CharCountHelper('e', 1));
        expectedResult1.add(new CharCountHelper('n', 3));

        List<CharCountHelper> expectedResult2 = new ArrayList<>();
        expectedResult2.add(new CharCountHelper('L', 1));
        expectedResult2.add(new CharCountHelper('a', 1));
        expectedResult2.add(new CharCountHelper('p', 2));
        expectedResult2.add(new CharCountHelper('t', 1));

        List<CharCountHelper> expectedResult3 = new ArrayList<>();
        expectedResult3.add(new CharCountHelper('V', 1));
        expectedResult3.add(new CharCountHelper('l', 1));
        expectedResult3.add(new CharCountHelper('i', 2));
        expectedResult3.add(new CharCountHelper('e', 1));
        expectedResult3.add(new CharCountHelper('g', 2));
        expectedResult3.add(new CharCountHelper('t', 1));
        expectedResult3.add(new CharCountHelper('u', 1));
    }
}