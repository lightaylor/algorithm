package baekjoon.silver.level1.test_4889;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int index = 1;
        while (!str.contains("-")) {
            Stack<Character> stack = new Stack<>();
            for (char c : str.toCharArray()) {
                if (!stack.isEmpty() && stack.peek() == '{' && c == '}')
                    stack.pop();
                else stack.push(c);
            }

            int open = 0;
            int close = 0;
            while (!stack.isEmpty()) {
                if (stack.pop() == '{') open++;
                else close++;
            }

            int result = (open + 1) / 2 + (close + 1) / 2;
            System.out.println(index++ + ". " + result);
            str = sc.nextLine();
        }
    }
}
