package hj.codingtest.programmers.datastructure;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 괄호_회전하기_test {
    괄호_회전하기 d = new 괄호_회전하기();

    @ParameterizedTest
    @MethodSource("generateData")
    void 괄호_회전하기(String s, int result) {
        int solution = d.solution(s);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of("[](){}", 3),
                Arguments.of("}]()[{", 2),
                Arguments.of("[)(]", 0),
                Arguments.of(")))", 0),
                Arguments.of("}}}", 0));
    }
}