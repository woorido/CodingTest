package hj.codingtest.programmers.string;

public class 문자열_내_p와_y의_개수 {
    boolean solution(String s) {
        boolean answer = true;

        int pCount = 0;
        int yCount = 0;

        for (char c : s.toCharArray()) {
            switch (c) {
                case 'y':
                case 'Y':
                    yCount++;
                    break;
                case 'p':
                case 'P':
                    pCount++;
                    break;
            }
        }

        if (pCount != yCount) {
            answer = false;
        }

        return answer;
    }
}
