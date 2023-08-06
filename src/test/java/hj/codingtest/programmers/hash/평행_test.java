package hj.codingtest.programmers.hash;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class 평행_test {
    평행 parallel = new 평행();

    @ParameterizedTest
    @MethodSource("generateData")
    void 순위_탐색(int[][] dots, int result) {
        int solution = parallel.solution(dots);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}}, 1),
                Arguments.of(new int[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}}, 0));
    }
}