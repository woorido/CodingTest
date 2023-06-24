package hj.codingtest.programmers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class 행렬의_곱셈_test {
    행렬의_곱셈 matrixMultiplication = new 행렬의_곱셈();

    @ParameterizedTest
    @MethodSource("generateData")
    void name(int[][] arr1, int[][] arr2, int[][] result) {
        int[][] solution = matrixMultiplication.solution(arr1, arr2);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 4}, {3, 2}, {4, 1}}, new int[][]{{3, 3}, {3, 3}}, new int[][]{{15, 15}, {15, 15}, {15, 15}}),
                Arguments.of(new int[][]{{2, 3, 2}, {4, 2, 4}, {3, 1, 4}}, new int[][]{{5, 4, 3}, {2, 4, 1}, {3, 1, 1}}, new int[][]{{22, 22, 11}, {36, 28, 18}, {29, 20, 14}})
        );
    }
}