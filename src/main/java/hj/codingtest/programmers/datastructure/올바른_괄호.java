package hj.codingtest.programmers.datastructure;

import java.util.Stack;

public class 올바른_괄호 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c){
                case '(' :
                    stack.push(c);
                    break;
                case ')' :
                    if(stack.isEmpty()) return false;
                    stack.pop();
                    break;
            }
        }
        return stack.isEmpty();
    }
}
