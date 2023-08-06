package hj.codingtest.programmers.hash;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 없는_숫자_더하기_test {
    없는_숫자_더하기 addMissingNumber = new 없는_숫자_더하기();

    @ParameterizedTest
    @MethodSource("generateData")
    void 없는_숫자_더하기(int[] numbers, int result) {
        int solution = addMissingNumber.solution(numbers);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 6, 7, 8, 0}, 14),
                Arguments.of(new int[]{5, 8, 4, 0, 6, 7, 9}, 6));
    }
}