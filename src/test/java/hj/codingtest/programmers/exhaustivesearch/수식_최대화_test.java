package hj.codingtest.programmers.exhaustivesearch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 수식_최대화_test {
    수식_최대화 maximizeFormula = new 수식_최대화();

    @ParameterizedTest
    @MethodSource("generateData")
    public void 수식_최대화(String expression, long result) {
        long solution = maximizeFormula.solution(expression);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of("100-200*300-500+20", 60420),
                Arguments.of("50*6-3*2", 300)
        );
    }
}