package com.sample.codemash;

import java.util.List;

public class SingleOneRule implements IScoringRule {

    @Override
    public int score(List<Integer> rolls) {
        int score = 0;
        // Could use lambdas here
        for (int roll : rolls) {
            if (roll == 1)
                score += 100;
        }
        return score;
    }

}
