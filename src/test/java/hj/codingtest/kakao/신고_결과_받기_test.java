package hj.codingtest.kakao;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class 신고_결과_받기_test {
    신고_결과_받기 d = new 신고_결과_받기();

    @ParameterizedTest
    @MethodSource("generateData")
    void 신고_결과_받기(String[] id_list, String[] report, int k, int[] result) {
        int[] solution = d.solution(id_list, report, k);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(
                        new String[]{"muzi", "frodo", "apeach", "neo"},
                        new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"},
                        2,
                        new int[]{2, 1, 1, 0}),
                Arguments.of(
                        new String[]{"con", "ryan"},
                        new String[]{"ryan con", "ryan con", "ryan con", "ryan con"},
                        3,
                        new int[]{0, 0})
        );
    }

}