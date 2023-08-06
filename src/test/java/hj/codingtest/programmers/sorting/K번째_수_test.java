package hj.codingtest.programmers.sorting;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class K번째_수_test {
    K번째_수 KthNumber = new K번째_수();

    @ParameterizedTest
    @MethodSource("generateData")
    void K번째_수(int[] array, int[][] commands, int[] result) {
        int[] solution = KthNumber.solution(array, commands);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}}, new int[]{5, 6}),
                Arguments.of(new int[]{1, 5, 2, 6}, new int[][]{{2, 3, 1}, {1, 3, 2}, {3, 3, 1}}, new int[]{2, 2, 2}),
                Arguments.of(new int[]{2, 5, 9, 8, 7, 3, 13}, new int[][]{{2, 3, 1}, {1, 3, 2}, {3, 3, 1}}, new int[]{5, 5, 9}),
                Arguments.of(new int[]{39, 8, 7, 10, 16, 1}, new int[][]{{2, 3, 1}, {1, 3, 2}, {3, 3, 1}}, new int[]{7, 8, 7}),
                Arguments.of(new int[]{39, 49, 50, 6, 16, 7}, new int[][]{{2, 3, 1}, {1, 3, 2}, {3, 3, 1}}, new int[]{49, 49, 50})
        );
    }
}