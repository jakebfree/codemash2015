package com.sample.codemash;

import java.util.List;

public class SingleFiveRule implements IScoringRule {

    @Override
    public int score(List<Integer> rolls) {
        int score = 0;
        // Could use lambdas here
        for (int roll : rolls) {
            if (roll == 5)
                score += 50;
        }
        return score;
    }

}
