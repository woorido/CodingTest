package com.hj.codingtest.programmers;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;


public class 교점에_별_만들기_test {

    교점에_별_만들기 makeStar = new 교점에_별_만들기();

    @Test
    public void 교점에_별_만들기() {
        int[][] line = {{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}};
        String[] result = {"....*....", ".........", ".........", "*.......*", ".........", ".........", ".........", ".........", "*.......*"};
        assertThat(makeStar.solution(line)).isEqualTo(result);

    }
    
    /*private static Stream<Arguments> line() {
        return Stream.of(
            Arguments.of((Object) new int[][]{{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}}, new String[]{"....*....", ".........", ".........", "*.......*", ".........", ".........", ".........", ".........", "*.......*"}),
            Arguments.of((Object) new int[][]{{0, 1, -1}, {1, 0, -1}, {1, 0, 1}}, new String[]{"*.*"})
        );
    }*/
    

}