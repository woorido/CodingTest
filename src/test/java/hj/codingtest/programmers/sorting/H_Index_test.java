package hj.codingtest.programmers.sorting;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class H_Index_test {
    H_Index hIndex = new H_Index();

    @ParameterizedTest
    @MethodSource("generateData")
    void H_Index(int[] citations, int result) {
        int solution = hIndex.solution(citations);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[]{3, 0, 6, 1, 5}, 3)
        );
    }
}