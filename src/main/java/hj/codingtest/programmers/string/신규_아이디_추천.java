package hj.codingtest.programmers.string;

public class 신규_아이디_추천 {
    public String solution(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9\\-_.]", "");
        s = s.replaceAll("\\.+", ".");
        s = s.replaceAll("^\\.+|\\.+$", "");
        if (s.isEmpty()) {
            s = "a";
        }
        if (s.length() > 15) {
            s = s.substring(0, 15);
            if (s.endsWith(".")) {
                s = s.substring(0, 14);
            }
        }
        while (s.length() < 3) {
            char c = s.charAt(s.length() - 1);
            s += c;
        }
        return s;
    }
}
