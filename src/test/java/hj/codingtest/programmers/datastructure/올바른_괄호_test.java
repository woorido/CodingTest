package hj.codingtest.programmers.datastructure;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 올바른_괄호_test {
    올바른_괄호 d = new 올바른_괄호();

    @ParameterizedTest
    @MethodSource("generateData")
    void 올바른_괄호(String s, boolean result) {
        boolean solution = d.solution(s);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of("()()", true),
                Arguments.of("(())()", true),
                Arguments.of(")()(", false),
                Arguments.of("(()(", false));
    }

}