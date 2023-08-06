package hj.codingtest.programmers.exhaustivesearch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class 소수_찾기_test {
    소수_찾기 findPrime = new 소수_찾기();

    @ParameterizedTest
    @MethodSource("generateData")
    public void 수식_최대화(String numbers, int result) {
        int solution = findPrime.solution(numbers);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of("011", 2),
                Arguments.of("17", 3)
        );
    }
}