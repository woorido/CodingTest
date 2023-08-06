package hj.codingtest.programmers.sorting;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 가장_큰_수_test {
    가장_큰_수 d = new 가장_큰_수();

    @ParameterizedTest
    @MethodSource("generateData")
    void 가장_큰_수(int[] numbers, String result) {
        String solution = d.solution(numbers);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(Arguments.of(new int[]{6, 10, 2}, "6210"),
                Arguments.of(new int[]{3, 30, 34, 5, 9}, "9534330"));
    }
}