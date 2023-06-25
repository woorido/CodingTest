package hj.codingtest.programmers.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 문자열_다루기_기본_test {
    문자열_다루기_기본 handleString = new 문자열_다루기_기본();

    @ParameterizedTest
    @MethodSource("generateData")
    void name(String s, boolean result) {
        boolean solution = handleString.solution(s);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of("a234", false),
                Arguments.of("1234", true)
        );
    }
}