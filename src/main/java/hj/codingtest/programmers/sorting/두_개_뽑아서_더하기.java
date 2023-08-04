package hj.codingtest.programmers.sorting;

import java.util.HashSet;
import java.util.Set;

public class 두_개_뽑아서_더하기 {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int num = numbers[i] + numbers[j];
                set.add(num);
            }
        }
        return set.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
