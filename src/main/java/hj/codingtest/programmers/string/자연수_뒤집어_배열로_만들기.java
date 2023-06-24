package hj.codingtest.programmers.string;

public class 자연수_뒤집어_배열로_만들기 {
    public int[] solution(long n) {

        String reversed = new StringBuilder().append(n).reverse().toString();

        char[] array = reversed.toCharArray();

        int[] answer = new int[array.length];

        //문자를 정수로 변환
        for (int i = 0; i < answer.length; i++) {
            answer[i] = array[i] - '0';
        }

        return answer;
    }
}
