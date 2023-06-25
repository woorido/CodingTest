package hj.codingtest.programmers.string;

public class 시저_암호 {
    public String solution(String s, int n) {

        StringBuilder stringBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            stringBuilder.append(push(n, c));
        }

        return stringBuilder.toString();
    }

    private char push(int n, char c) {
        if (!Character.isAlphabetic(c)) {
            return c;
        }

        int offset = Character.isUpperCase(c) ? 'A' : 'a';
        int position = (c - offset + n) % 26;
        return (char) (offset + position);
    }
}
