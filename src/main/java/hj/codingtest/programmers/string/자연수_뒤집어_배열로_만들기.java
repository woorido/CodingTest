package hj.codingtest.programmers.string;

public class 자연수_뒤집어_배열로_만들기 {
    public int[] solution(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
        /*String reversed = new StringBuilder().append(n).reverse().toString();
        char[] array = reversed.toCharArray();
        int[] result = new int[array.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[i] - '0';
        }
        return result;*/
    }
}
