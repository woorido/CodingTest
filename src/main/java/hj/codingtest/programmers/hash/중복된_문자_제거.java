package hj.codingtest.programmers.hash;

import java.util.HashSet;
import java.util.Set;

public class 중복된_문자_제거 {
    public String solution(String my_string) {
        StringBuilder builder = new StringBuilder();
        Set<Character> used = new HashSet<>();
        for (char c : my_string.toCharArray()) {
            if(used.contains(c)) continue;
            used.add(c);
            builder.append(c);
        }
        return builder.toString();
    }
}
