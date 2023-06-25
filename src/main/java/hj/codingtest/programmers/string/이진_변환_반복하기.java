package hj.codingtest.programmers.string;

public class 이진_변환_반복하기 {
    public int[] solution(String s) {
        int removed = 0;
        int loop = 0;
        while (!s.equals("1")) {
            char[] chars = s.toCharArray();
            for (char c : chars) {
                if (c == '0') {
                    removed++;
                }
            }
            s = s.replaceAll("0", "");
            s = Integer.toString(s.length(), 2);
            loop++;
        }

        int[] answer = new int[]{loop, removed};
        return answer;
    }
}
