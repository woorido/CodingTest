package hj.codingtest.programmers.hash;

import java.util.HashSet;
import java.util.Set;

public class 평행 {
    public int solution(int[][] dots) {
        //모든 점 사이의 기울기를 계산하여 같은 기울기가 있는지 구하면 됨
        Set<Double> slopes = new HashSet<>();
        for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                double slope = getSlope(dots[i][0], dots[i][1], dots[j][0], dots[j][1]);
                if (slopes.contains(slope)) {
                    return 1;
                }
                slopes.add(slope);
            }
        }
        return 0;
    }

    private double getSlope(int x1, int y1, int x2, int y2) {
        return (double) (y2 - y1) / (x2 - x1);
    }
}
