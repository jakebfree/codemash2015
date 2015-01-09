package com.sample.codemash;

import java.util.Collections;
import java.util.List;

public class TripleOnesRule implements IScoringRule {

    @Override
    public int score(List<Integer> rolls) {
        boolean threeOnes = true;

        for (int i = 0; i < 3; i++) {
            if (rolls.get(i) != 1) {
                threeOnes = false;
            }
        }

        int x = Collections.frequency(rolls, 1);

        if (threeOnes) {
            for (int i = 0; i < 3; i++) {
                rolls.remove(0);
            }
            return 1000;
        }
        else
            return 0;
    }

}
