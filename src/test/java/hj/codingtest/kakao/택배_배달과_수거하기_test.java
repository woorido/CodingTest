package hj.codingtest.kakao;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 택배_배달과_수거하기_test {
    택배_배달과_수거하기 d = new 택배_배달과_수거하기();

    @ParameterizedTest
    @MethodSource("generateData")
    void 택배_배달과_수거하기(int cap, int n, int[] deliveries, int[] pickups, long result) {
        long solution = d.solution(cap, n, deliveries, pickups);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(4, 5, new int[]{1, 0, 3, 1, 2}, new int[]{0, 3, 0, 4, 0}, 16),
                Arguments.of(10, 4, new int[]{6, 8, 3, 4}, new int[]{7, 2, 5, 10}, 20),
                Arguments.of(2, 7, new int[]{1, 0, 2, 0, 1, 0, 2}, new int[]{0, 2, 0, 1, 0, 2, 0}, 30));
    }


}