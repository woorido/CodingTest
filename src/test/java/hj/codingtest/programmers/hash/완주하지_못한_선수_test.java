package hj.codingtest.programmers.hash;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 완주하지_못한_선수_test {
    완주하지_못한_선수 d = new 완주하지_못한_선수();

    @ParameterizedTest
    @MethodSource("generateData")
    void 완주하지_못한_선수(String[] participant, String[] completion, String result) {
        String solution = d.solution(participant, completion);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}, "leo"),
                Arguments.of(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}, "vinko"),
                Arguments.of(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}, "mislav"));
    }

}