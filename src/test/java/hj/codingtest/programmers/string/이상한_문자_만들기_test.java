package hj.codingtest.programmers.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 이상한_문자_만들기_test {
    이상한_문자_만들기 makeString = new 이상한_문자_만들기();

    @ParameterizedTest
    @MethodSource("generateData")
    void name(String s, String result) {
        String solution = makeString.solution(s);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of("try hello world", "TrY HeLlO WoRlD")
        );
    }
}