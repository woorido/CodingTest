package hj.codingtest.programmers.recursion;

import java.util.ArrayList;
import java.util.List;

public class 모음_사전 {

    private static final char[] CHARS = "AEIOU".toCharArray();

    public int solution(String word) {

        return generate("").indexOf(word);
    }

    private static List<String> generate(String word){
        List<String> words = new ArrayList<>();
        words.add(word);

        if(word.length() == 5){
            return words;
        }
        for (char c : CHARS) {
            words.addAll(generate(word + c));
        }
        return words;
    }
}
