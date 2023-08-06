package hj.codingtest.kakao;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class 이모티콘_할인행사_test {

    이모티콘_할인행사 event = new 이모티콘_할인행사();

    @ParameterizedTest
    @MethodSource("generateData")
    void 이모티콘_할인행사(int[][] users, int[] emoticons, int[] result) {
        int[] solution = event.solution(users, emoticons);
        assertThat(solution).isEqualTo(result);
    }

    private static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[][]{{40, 10000}, {25, 10000}}, new int[]{7000, 9000}, new int[]{1, 5400}),
                Arguments.of(new int[][]{{40, 2900}, {23, 10000}, {11, 5200}, {5, 5900}, {40, 3100}, {27, 9200}, {32, 6900}}, new int[]{1300, 1500, 1600, 4900}, new int[]{4, 13860}));
    }
//    for (int i = 0; i < users.length; i++) {
//        int userDiscountRate = users[i][0];
//        int userMaxCost = users[i][1];
//        int maxEmoticons = 0;
//
//        for (int j = 0; j < discount.length; j++) {
//            int discountedCost = emoticons[i] * (100 - discount[j]) / 100;
//            int affordableEmoticons = userMaxCost / discountedCost;
//            maxEmoticons = Math.max(maxEmoticons, affordableEmoticons);
//        }
//
//    }
}