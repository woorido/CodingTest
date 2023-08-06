package hj.codingtest.programmers.recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 하노이의_탑_test {
    하노이의_탑 top = new 하노이의_탑();

    @ParameterizedTest
    @MethodSource("generateData")
    public void 하노이의_탑(int n, int[][] result) {
        assertThat(top.solution(n)).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(// [1,3], [1,2], [3,2], [1,3], [2,1], [2,3], [1,3]
                Arguments.of(3, new int[][]{{1, 3}, {1, 2}, {3, 2}, {1, 3}, {2, 1}, {2, 3}, {1, 3}}),
                Arguments.of(2, new int[][]{{1, 2}, {1, 3}, {2, 3}})
        );
    }

}