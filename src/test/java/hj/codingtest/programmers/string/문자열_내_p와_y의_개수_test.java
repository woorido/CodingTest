package hj.codingtest.programmers.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 문자열_내_p와_y의_개수_test {
    문자열_내_p와_y의_개수 countPAndY = new 문자열_내_p와_y의_개수();

    @ParameterizedTest
    @MethodSource("generateData")
    void name(String s, boolean result) {
        boolean solution = countPAndY.solution(s);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of("pPoooyY", true),
                Arguments.of("Pyy", false)
        );
    }
}