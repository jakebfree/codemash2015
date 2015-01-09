package com.sample.codemash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GreedKata {
    public static int scoreDice(int d1, int d2, int d3, int d4, int d5) {
        int totalScore = 0;
        ArrayList<Integer> rolls = new ArrayList<Integer>(Arrays.asList(d1, d2, d3, d4, d5));
        Collections.sort(rolls);

        // Check score for triple ones
        IScoringRule rule = new TripleOnesRule();
        totalScore += rule.score(rolls);

        // Check score for single ones
        rule = new SingleOneRule();
        totalScore += rule.score(rolls);

        // Check score for single fives
        rule = new SingleFiveRule();
        totalScore += rule.score(rolls);
        return totalScore;
    }
}