package hj.codingtest.programmers.string;

public class 이상한_문자_만들기 {
    public String solution(String s) {

        StringBuilder stringBuilder = new StringBuilder();
        boolean toUpper = true;

        for (char c : s.toCharArray()) {

            if (!Character.isAlphabetic(c)) {
                stringBuilder.append(c);
                toUpper = true;
            } else {
                if (toUpper) {
                    stringBuilder.append(Character.toUpperCase(c));
                } else {
                    stringBuilder.append(c);
                }
                toUpper = !toUpper;
            }
        }

        return stringBuilder.toString();
    }
}
