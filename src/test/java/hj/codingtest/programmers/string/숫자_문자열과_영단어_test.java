package hj.codingtest.programmers.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 숫자_문자열과_영단어_test {
    숫자_문자열과_영단어 numberAndEnglish = new 숫자_문자열과_영단어();

    @ParameterizedTest
    @MethodSource("generateData")
    void name(String s, int result) {
        int solution = numberAndEnglish.solution(s);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of("one4seveneight", 1478),
                Arguments.of("23four5six7", 234567),
                Arguments.of("2three45sixseven", 234567),
                Arguments.of("123", 123)
        );
    }
}