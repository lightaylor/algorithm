import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            s = s.substring(1, s.length()) + s.substring(0, 1);
            answer += validate(s) ? 1 : 0;
        }

        return answer;
    }

    private boolean validate(String str) {
        Stack<Character> stack = new Stack<>();
        char c;
        char peek;

        for(int i = 0; i < str.length(); i++) {
            if (stack.empty()) {
                stack.add(str.charAt(i));
            } else {
                c = str.charAt(i);
                peek = stack.peek();
                if (c == ']' || c == '}' || c == ')') {
                    if (peek == '[' && c == ']') {
                        stack.pop();
                    } else if (peek == '{' && c == '}') {
                        stack.pop();
                    } else if (peek == '(' && c == ')') {
                        stack.pop();
                    } else {
                        stack.add(str.charAt(i));
                    }
                } else {
                    stack.add(str.charAt(i));
                }
            }
        }
        return stack.empty() ? true : false;
    }
}
