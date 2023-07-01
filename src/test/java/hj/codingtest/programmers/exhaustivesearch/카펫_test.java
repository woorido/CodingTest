package hj.codingtest.programmers.exhaustivesearch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 카펫_test {
    카펫 c = new 카펫();

    @ParameterizedTest
    @MethodSource("generateData")
    public void 카펫(int brown, int yellow, int[] result){
        int[] solution = c.solution(brown, yellow);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData(){
        return Stream.of(
                Arguments.of(10, 2, new int[]{4, 3}),
                Arguments.of(8, 1, new int[]{3, 3}),
                Arguments.of(24, 24, new int[]{8, 6})
        );
    }

}