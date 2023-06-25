package hj.codingtest.programmers.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 신규_아이디_추천_test {
    신규_아이디_추천 recommendNewId = new 신규_아이디_추천();

    @ParameterizedTest
    @MethodSource("generateData")
    void name(String s, String result) {
        String solution = recommendNewId.solution(s);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of("...!@BaT#*..y.abcdefghijklm", "bat.y.abcdefghi"),
                Arguments.of("z-+.^.", "z--"),
                Arguments.of("=.=", "aaa"),
                Arguments.of("123_.def", "123_.def"),
                Arguments.of("abcdefghijklmn.p", "abcdefghijklmn")
        );
    }
}