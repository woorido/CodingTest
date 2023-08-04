package hj.codingtest.programmers.sorting;

import java.util.Arrays;

public class H_Index {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        for (int i = citations.length; i > 0; i--) {
            int index = citations.length - i;
            if (citations[index] >= i) {
                return i;
            }
        }
        return 0;
    }
}
