package baekjoon.silver.level4.test_9012;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            char[] arr = br.readLine().toCharArray();
            Stack<Character> stack = new Stack<>();

            for (char c : arr) {
                if (!stack.isEmpty() && stack.peek() == '(' && c == ')') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

            bw.write(stack.isEmpty() ? "YES" : "NO");
            bw.newLine();
        }
        bw.close();
    }
}
