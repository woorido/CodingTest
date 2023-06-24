package hj.codingtest.programmers.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 자연수_뒤집어_배열로_만들기_test {
    자연수_뒤집어_배열로_만들기 turnNumberIntoArray = new 자연수_뒤집어_배열로_만들기();

    @ParameterizedTest
    @MethodSource("generateData")
    void name(long number, int[] result) {
        int[] solution = turnNumberIntoArray.solution(number);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(12345, new int[]{5, 4, 3, 2, 1})
        );
    }
}