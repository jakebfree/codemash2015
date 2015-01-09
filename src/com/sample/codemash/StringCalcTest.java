package com.sample.codemash;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalcTest {

    @Test
    public void testEmptyStringReturnsZero() throws Exception {
        assertEquals(0, StringCalc.add(""));
    }

    @Test
    public void testReturnsSingleValue() throws Exception {
        assertEquals(1, StringCalc.add("1"));
        assertEquals(2, StringCalc.add("2"));
        assertEquals(42, StringCalc.add("42"));
    }

    @Test
    public void testTwoValuesWithCommas() throws Exception {
        assertEquals(2, StringCalc.add("1,1"));
        assertEquals(3, StringCalc.add("1,2"));
        assertEquals(1, StringCalc.add("1,"));
        assertEquals(12, StringCalc.add("10,2"));
    }

    @Test
    public void testMultipleValuesWithCommas() throws Exception {
        assertEquals(3, StringCalc.add("1,1,1"));
        assertEquals(6, StringCalc.add("1,2,3"));
        assertEquals(4, StringCalc.add("4,,"));
        assertEquals(36, StringCalc.add("34,2"));
    }

    @Test
    public void testTwoValuesWithNewlines() throws Exception {
        assertEquals(2, StringCalc.add("1\n1"));
        assertEquals(3, StringCalc.add("1\n2"));
        assertEquals(1, StringCalc.add("1\n"));
        assertEquals(12, StringCalc.add("10\n2"));
    }

    @Test
    public void testMultipleValuesWithNewlines() throws Exception {
        assertEquals(3, StringCalc.add("1\n1\n1"));
        assertEquals(6, StringCalc.add("1\n2\n3"));
        assertEquals(4, StringCalc.add("4\n\n"));
        assertEquals(36, StringCalc.add("34\n2"));
    }

}