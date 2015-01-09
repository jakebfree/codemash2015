package com.sample.codemash;

import java.util.List;

public interface IScoringRule {
    public abstract int score(List<Integer> rolls);
}
