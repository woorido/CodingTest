package hj.codingtest.programmers.string;

import java.util.ArrayList;
import java.util.List;

public class 문자열_압축 {

    public int solution(String s) {

        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= s.length(); i++) {
            int compress = compress(s, i);
            if (min > compress) {
                min = compress;
            }
        }
        return min;
    }

    private int compress(String s, int i) {

        StringBuilder builder = new StringBuilder();
        String last = "";
        int count = 0;

        for (String token : split(s, i)) {
            if (last.equals(token)) {
                count++;
            } else {
                if (count > 1) {
                    builder.append(count);
                }
                builder.append(last);
                last = token;
                count = 1;
            }
        }

        if (count > 1) builder.append(count);
        builder.append(last);

        return builder.length();
    }

    private List<String> split(String s, int length) {
        List<String> strings = new ArrayList<>();
        for (int startIndex = 0; startIndex < s.length(); startIndex += length) {
            int endIndex = startIndex + length;
            if (endIndex > s.length()) endIndex = s.length();
            strings.add(s.substring(startIndex, endIndex));
        }
        return strings;
    }

}
