package hj.codingtest.programmers.hash;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class A로_B_만들기_test {
    A로_B_만들기 makeBFromA = new A로_B_만들기();

    @ParameterizedTest
    @MethodSource("generateData")
    void A로_B_만들기(String before, String after, int result) {
        int solution = makeBFromA.solution(before, after);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of("olleh", "hello", 1),
                Arguments.of("allpe", "apple", 0));
    }


}