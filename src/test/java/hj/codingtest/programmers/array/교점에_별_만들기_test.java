package hj.codingtest.programmers.array;

import static org.assertj.core.api.Assertions.*;

import hj.codingtest.programmers.array.교점에_별_만들기;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class 교점에_별_만들기_test {

    교점에_별_만들기 makeStar = new 교점에_별_만들기();

    @ParameterizedTest
    @MethodSource("generateData")
    public void 교점에_별_만들기(int[][] line, String[] result) {
        String[] solution = makeStar.solution(line);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[][]{{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}}, new String[]{"....*....", ".........", ".........", "*.......*", ".........", ".........", ".........", ".........", "*.......*"}),
                Arguments.of(new int[][]{{0, 1, -1}, {1, 0, -1}, {1, 0, 1}}, new String[]{"*.*"})
        );
    }

}