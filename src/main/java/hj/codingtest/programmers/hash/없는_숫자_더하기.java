package hj.codingtest.programmers.hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 없는_숫자_더하기 {
    public int solution(int[] numbers) {

        Set<Integer> set = new HashSet<>();
        for (int number : numbers) {
            set.add(number);
        }

        int sum = 0;
        for (int i = 1; i < 10; i++) {
            if(set.contains(i)) {
                continue;
            }
            sum += i;
        }

        int answer = 0;
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            if(Arrays.stream(numbers).noneMatch(j -> j == finalI)){
                answer += i;
            }

        }

        return sum;
    }
}
