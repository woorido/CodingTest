package hj.codingtest.programmers.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class 이진_변환_반복하기_test {
    이진_변환_반복하기 repeatBinaryConversion = new 이진_변환_반복하기();

    @ParameterizedTest
    @MethodSource("generateData")
    void name(String s, int[] result) {
        int[] solution = repeatBinaryConversion.solution(s);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of("110010101001", new int[]{3, 8}),
                Arguments.of("01110", new int[]{3, 3}),
                Arguments.of("1111111", new int[]{4, 1})
        );
    }

}