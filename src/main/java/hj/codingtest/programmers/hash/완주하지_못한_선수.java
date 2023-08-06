package hj.codingtest.programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class 완주하지_못한_선수 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> count = new HashMap<>();

        for (String s : participant) {
            count.putIfAbsent(s, 0);
            count.put(s, count.get(s) + 1);
        }

        for (String s : completion) {
            Integer integer = count.get(s) - 1;
            count.put(s, integer);
            if (integer == 0) {
                count.remove(s);
            }
        }

        return count.keySet().iterator().next();
    }
}
