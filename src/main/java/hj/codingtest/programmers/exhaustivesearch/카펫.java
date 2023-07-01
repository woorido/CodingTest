package hj.codingtest.programmers.exhaustivesearch;

public class 카펫 {
    public int[] solution(int brown, int yellow) {
        for (int width = 3; width < 5000; width++) {
            for (int height = 3; height <= width; height++) {
                int boundary = (width + height - 2) * 2;
                int center = (width * height) - boundary;
                if (brown == boundary && yellow == center) {
                    return new int[]{width, height};
                }
            }
        }
        return null;
    }
}
