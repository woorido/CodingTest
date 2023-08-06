package hj.codingtest.programmers.exhaustivesearch;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 수식_최대화 {

    private final String[][] precedences = {
            "*+-".split(""),
            "*-+".split(""),
            "+-*".split(""),
            "+*-".split(""),
            "-+*".split(""),
            "-*+".split(""),
    };

    public long solution(String expression) {

        StringTokenizer tokenizer = new StringTokenizer(expression, "+-*", true);
        List<String> tokens = new ArrayList<>();

        while (tokenizer.hasMoreTokens()) {
            tokens.add(tokenizer.nextToken());
        }

        long value = 0;
        for (String[] precedence : precedences) {
            long abs = Math.abs(calculate(precedence, new ArrayList<>(tokens)));
            if (abs > value) {
                value = abs;
            }
        }

        return value;
    }

    private long calculate(String[] precedence, List<String> tokens) {
        for (String s : precedence) {
            for (int i = 0; i < tokens.size(); i++) {
                if (tokens.get(i).equals(s)) {
                    long calculate = calculate(Long.parseLong(tokens.get(i - 1)), Long.parseLong(tokens.get(i + 1)), tokens.get(i));
                    tokens.remove(i - 1);
                    tokens.remove(i - 1);
                    tokens.remove(i - 1);
                    tokens.add(i - 1, String.valueOf(calculate));
                    i -= 2;
                }
            }
        }
        return Long.parseLong(tokens.get(0));
    }

    private long calculate(long lhs, long rhs, String op) {
        switch (op) {
            case "+":
                return lhs + rhs;
            case "-":
                return lhs - rhs;
            case "*":
                return lhs * rhs;
            default:
                return 0;
        }
    }
}
