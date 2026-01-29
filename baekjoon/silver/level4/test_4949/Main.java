package baekjoon.silver.level4.test_4949;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();

        while (!n.equals(".")) {
            Stack<Character> stack = new Stack<>();
            char[] arr = n.replaceAll("[^\\[\\]\\(\\)]", "").toCharArray();

            for (char c : arr) {
                if (!stack.isEmpty() && stack.peek() == '(' && c == ')') {
                    stack.pop();
                } else if (!stack.isEmpty() && stack.peek() == '[' && c == ']') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

            bw.write(stack.isEmpty() ? "yes" : "no");
            bw.newLine();
            n = br.readLine();
        }
        bw.close();
    }
}
