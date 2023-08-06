package hj.codingtest.kakao;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 메뉴_리뉴얼_test {
    메뉴_리뉴얼 d = new 메뉴_리뉴얼();

    @ParameterizedTest
    @MethodSource("generateData")
    void 메뉴_리뉴얼(String[] orders, int[] course, String[] result) {
        String[] solution = d.solution(orders, course);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(Arguments.of(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2, 3, 4}, new String[]{"AC", "ACDE", "BCFG", "CDE"}),
                Arguments.of(new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"}, new int[]{2, 3, 5}, new String[]{"ACD", "AD", "ADE", "CD", "XYZ"}),
                Arguments.of(new String[]{"XYZ", "XWY", "WXA"}, new int[]{2, 3, 4}, new String[]{"WX", "XY"}));
    }
}