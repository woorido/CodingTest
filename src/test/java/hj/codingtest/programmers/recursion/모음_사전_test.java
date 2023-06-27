package hj.codingtest.programmers.recursion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 모음_사전_test {
    모음_사전 collectString = new 모음_사전();

    @ParameterizedTest
    @MethodSource("generateData")
    void name(String s, int result) {
        int solution = collectString.solution(s);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of("AAAAE", 6),
                Arguments.of("AAAE", 10),
                Arguments.of("I", 1563),
                Arguments.of("EIO", 1189)
        );
    }
}