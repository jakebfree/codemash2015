package com.sample.codemash;

import org.junit.Test;

import static org.junit.Assert.*;


public class FizzBuzzerTest {

    @Test
    public void testThreeIsFizz() throws Exception {

        assertTrue("Fizz".equals(FizzBuzzer.fizzBuzz(3)));
    }

    @Test
    public void testFiveIsBuzz() throws Exception {

        assertTrue("Buzz".equals(FizzBuzzer.fizzBuzz(5)));
    }

    @Test
    public void testFifteenIsFizzBuzz() throws Exception {

        assertTrue("FizzBuzz".equals(FizzBuzzer.fizzBuzz(15)));
    }

    @Test
    public void testThreeDoesntReturn3() throws Exception {

        assertFalse("3".equals(FizzBuzzer.fizzBuzz(3)));
    }

    @Test
    public void testFiveDoesntReturn5() throws Exception {

        assertFalse("5".equals(FizzBuzzer.fizzBuzz(5)));
    }

    @Test
    public void testFifteenDoesntReturn15() throws Exception {

        assertFalse("15".equals(FizzBuzzer.fizzBuzz(15)));
    }

    @Test
    public void testNonFizzOrBuzz() throws Exception {

        assertTrue("1".equals(FizzBuzzer.fizzBuzz(1)));
        assertTrue("2".equals(FizzBuzzer.fizzBuzz(2)));
        assertFalse("3".equals(FizzBuzzer.fizzBuzz(3)));
        assertTrue("4".equals(FizzBuzzer.fizzBuzz(4)));
        assertFalse("5".equals(FizzBuzzer.fizzBuzz(5)));
        assertFalse("15".equals(FizzBuzzer.fizzBuzz(15)));
    }
}