package hj.codingtest.programmers.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 시저_암호_test {
    시저_암호 caesarCipher = new 시저_암호();

    @ParameterizedTest
    @MethodSource("generateData")
    void name(String alphabet, int push, String result) {
        String solution = caesarCipher.solution(alphabet, push);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of("AB", 1, "BC"),
                Arguments.of("z", 1, "a"),
                Arguments.of("a B z", 4, "e F d")
        );
    }
}