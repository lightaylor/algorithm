package silver.level2.test_1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        int idx = 1;
        StringBuffer answer = new StringBuffer();
        for (int i : arr) {
            while (idx <= i) {
                stack.push(idx++);
                answer.append("+\n");
            }

            if (!stack.isEmpty() && stack.peek() == i) {
                stack.pop();
                answer.append("-\n");
            } else {
                answer = new StringBuffer("NO");
                break;
            }
        }
        System.out.print(answer);
    }
}
