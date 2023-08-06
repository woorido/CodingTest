package hj.codingtest.programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class A로_B_만들기 {
    public int solution(String before, String after) {
        int answer = 0;
        if(toMap(after).equals(toMap(before))) {
            answer++;
        }
        return answer;
    }

    private static Map<Character, Integer> toMap(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : word.toCharArray()) {
            map.putIfAbsent(c, 0);
            map.put(c, map.get(c) +1);
        }
        return map;
    }


}
