package baekjoon.silver.level4.test_10828;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");

            if (str[0].equals("push")) {
                stack.push(Integer.parseInt(str[1]));
            } else if (str[0].equals("top")) {
                bw.write(stack.isEmpty() ? "-1" : String.valueOf(stack.peek()));
                bw.newLine();
            } else if (str[0].equals("pop")) {
                bw.write(stack.isEmpty() ? "-1" : String.valueOf(stack.pop()));
                bw.newLine();
            } else if (str[0].equals("size")) {
                bw.write(String.valueOf(String.valueOf(stack.size())));
                bw.newLine();
            } else if (str[0].equals("empty")) {
                bw.write(stack.isEmpty() ? "1" : "0");
                bw.newLine();
            }
        }
        bw.close();
    }
}
