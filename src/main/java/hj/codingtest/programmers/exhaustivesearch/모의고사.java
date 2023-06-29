package hj.codingtest.programmers.exhaustivesearch;

import java.util.stream.IntStream;

public class 모의고사 {

    private final int[][] RULES = new int[][]{
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
    };

    public int[] solution(int[] answers) {

        int[] count = new int[RULES.length];
        int max = 0;

        for (int i = 0; i < RULES.length; i++) {
            int[] rule = RULES[i];
            for (int j = 0; j < answers.length; j++) {
                int pick = rule[j % rule.length];
                int answer = answers[j];
                if (pick == answer) {
                    if (++count[i] > max) {
                        max = count[i];
                    }
                }
            }
        }

        int finalMax = max;
        return IntStream.range(0, 3)
                .filter(i -> count[i] == finalMax)
                .map(i -> i + 1)
                .toArray();
    }

}
