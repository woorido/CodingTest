package hj.codingtest.programmers.string;

public class 자연수_뒤집어_배열로_만들기 {
    public int[] solution(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}
