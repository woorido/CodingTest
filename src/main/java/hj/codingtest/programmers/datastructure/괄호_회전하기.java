package hj.codingtest.programmers.datastructure;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class 괄호_회전하기 {
    public int solution(String s) {

        String newString = s;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (checkString(newString)) count++;
            newString = newString.substring(1, s.length()) + newString.charAt(0);
        }
        return count;
    }

    private boolean checkString(String newString) {
        Stack<Character> stack = new Stack<>();

        for (char c : newString.toCharArray()) {
            switch (c) {
                case '[':
                case '{':
                case '(':
                    stack.push(c);
                    break;
                case ']':
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                case '}':
                    if (!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                case ')':
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
            }
        }

        return stack.isEmpty();
    }

}
