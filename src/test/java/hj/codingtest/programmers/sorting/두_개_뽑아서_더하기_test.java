package hj.codingtest.programmers.sorting;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 두_개_뽑아서_더하기_test {
    두_개_뽑아서_더하기 pickTwoAddThem = new 두_개_뽑아서_더하기();

    @ParameterizedTest
    @MethodSource("generateData")
    void 두_개_뽑아서_더하기(int[] numbers, int[] result) {
        int[] solution = pickTwoAddThem.solution(numbers);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[]{2, 1, 3, 4, 1}, new int[]{2, 3, 4, 5, 6, 7}),
                Arguments.of(new int[]{5, 0, 2, 7}, new int[]{2, 5, 7, 9, 12})
        );
    }
}