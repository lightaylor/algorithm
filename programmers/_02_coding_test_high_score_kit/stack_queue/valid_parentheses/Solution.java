package programmers._02_coding_test_high_score_kit.stack_queue.valid_parentheses;

import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        char[] cArray = s.toCharArray();
        stack.push(cArray[0]);

        for (int i = 1; i < cArray.length; i++) {
            if (!stack.empty() && cArray[i] == ')' && stack.peek() ==  '(') {
                stack.pop();
            } else {
                stack.push(cArray[i]);
            }
        }

        return stack.empty();
    }
}
