package hj.codingtest.programmers.string;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 문자열_압축_test {
    문자열_압축 stringCompression = new 문자열_압축();

    @ParameterizedTest
    @MethodSource("generateData")
    void name(String s, int result) {
        int solution = stringCompression.solution(s);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of("aabbaccc", 7),
                Arguments.of("ababcdcdababcdcd", 9),
                Arguments.of("abcabcabcabcdededededede", 14),
                Arguments.of("xababcdcdababcdcd", 17)
        );
    }

}