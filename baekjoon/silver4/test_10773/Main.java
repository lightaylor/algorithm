package silver4.test_10773;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());

            if (m > 0) {
                stack.push(m);
                count += m;
            } else {
                count -= stack.pop();

            }
        }

        bw.write(String.valueOf(count));
        bw.close();
    }
}
