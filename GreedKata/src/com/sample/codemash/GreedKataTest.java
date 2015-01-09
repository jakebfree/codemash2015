package com.sample.codemash;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreedKataTest {

    @Test
    public void testScoreDice23462return0() {
        assertEquals("Should return 0", 0, com.sample.codemash.GreedKata.scoreDice( 2, 3, 4, 6, 2 ));
    }

    @Test
    public void testScoreDice23461return100() {
        assertEquals("Should return 100", 100, com.sample.codemash.GreedKata.scoreDice( 2, 3, 4, 6, 1 ));
    }

    @Test
    public void testScoreDice23465return50() {
        assertEquals("Should return 50", 50, com.sample.codemash.GreedKata.scoreDice( 2, 3, 4, 6, 5 ));
    }

    @Test
    public void testScoreDice11123return1000() {
        assertEquals("Should return 1000", 1000, com.sample.codemash.GreedKata.scoreDice( 1, 1, 1, 2, 3 ));
    }

    @Test
    public void testScoreDice22234return200() {
        assertEquals("Should return 200", 200, com.sample.codemash.GreedKata.scoreDice( 2, 2, 2, 3, 4 ));
    }
}
