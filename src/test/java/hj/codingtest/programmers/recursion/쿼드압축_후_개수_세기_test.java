package hj.codingtest.programmers.recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 쿼드압축_후_개수_세기_test {
    쿼드압축_후_개수_세기 countCompressionQuad = new 쿼드압축_후_개수_세기();

    @ParameterizedTest
    @MethodSource("generateData")
    public void 쿼드압축_후_개수_세기(int[][] arr, int[] result) {
        assertThat(countCompressionQuad.solution(arr)).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 1, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 1}, {1, 1, 1, 1}}, new int[]{4, 9}),
                Arguments.of(new int[][]{{1, 1, 1, 1, 1, 1, 1, 1}, {0, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 1, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 1}, {0, 0, 0, 0, 1, 0, 0, 1}, {0, 0, 0, 0, 1, 1, 1, 1}}, new int[]{10, 15})
        );
    }
}