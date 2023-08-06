package hj.codingtest.programmers.implementation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class 스킬_트리_test {
    스킬_트리 skillTree = new 스킬_트리();

    @ParameterizedTest
    @MethodSource("generateData")
    void 완주하지_못한_선수(String skill, String[] skill_trees, int result) {
        int solution = skillTree.solution(skill, skill_trees);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}, 2));
    }
}