package hj.codingtest.kakao;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 키패드_누르기_test {
    키패드_누르기 d = new 키패드_누르기();

    @ParameterizedTest
    @MethodSource("generateData")
    void 키패드_누르기(int[] numbers, String hand, String result) {
        String solution = d.solution(numbers, hand);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(Arguments.of(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right", "LRLLLRLLRRL"),
                Arguments.of(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left", "LRLLRRLLLRR"),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right", "LLRLLRLLRL"));
    }
}