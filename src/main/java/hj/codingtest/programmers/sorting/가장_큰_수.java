package hj.codingtest.programmers.sorting;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 가장_큰_수 {
    public String solution(int[] numbers) {
        String collect = Arrays.stream(numbers).mapToObj(String::valueOf)
                .sorted((s1, s2) -> {
                    System.out.println("s1 = " + s1);
                    System.out.println("s2 = " + s2);

                    int original = Integer.parseInt(s1 + s2);
                    int reversed = Integer.parseInt(s2 + s1);
                    System.out.println("original = " + original);
                    System.out.println("reversed = " + reversed);
                    return reversed - original;
                }).collect(Collectors.joining(""));
        System.out.println("collect = " + collect);


        String answer = "";
        return answer;
    }
}
