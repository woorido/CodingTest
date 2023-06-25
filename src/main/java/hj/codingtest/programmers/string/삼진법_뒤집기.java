package hj.codingtest.programmers.string;

public class 삼진법_뒤집기 {
    public int solution(int n) {
        //n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요
        String string = Integer.toString(n, 3);
        String reversed = new StringBuilder(string).reverse().toString();
        return Integer.parseInt(reversed, 3);
    }
}
