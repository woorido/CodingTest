package hj.codingtest.programmers.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 삼진법_뒤집기_test {
    삼진법_뒤집기 flipTernaryNotation = new 삼진법_뒤집기();

    @ParameterizedTest
    @MethodSource("generateData")
    void name(int n, int result) {
        int solution = flipTernaryNotation.solution(n);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(45, 7),
                Arguments.of(125, 229)
        );
    }

}