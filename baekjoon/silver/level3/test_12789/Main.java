package baekjoon.silver.level3.test_12789;

import java.io.*;
import java.util.Stack;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Stack<Integer> stack = new Stack<>();
        int idx = 1;

        for (Integer i : arr) {
            if (i == idx) {
                idx++;
            } else if (stack.isEmpty() || stack.peek() != idx) {
                stack.push(i);
            }

            while (!stack.isEmpty() && stack.peek() == idx) {
                stack.pop();
                idx++;
            }
        }

        bw.write(stack.isEmpty() ? "Nice" : "Sad");
        bw.close();
    }
}
