package hj.codingtest.programmers.exhaustivesearch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 모의고사_test {
    모의고사 exam = new 모의고사();

    @ParameterizedTest
    @MethodSource("generateData")
    public void 모의고사(int[]arr, int[] result) {
        assertThat(exam.solution(arr)).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4,5}, new int[]{1}),
                Arguments.of(new int[]{1,3,2,4,2}, new int[]{1, 2, 3})
        );
    }

}