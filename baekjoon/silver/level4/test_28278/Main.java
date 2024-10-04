package silver.level4.test_28278;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" " );
            switch (arr[0]) {
                case "1":
                    stack.push(arr[1]);
                    break;
                case "2":
                    if (stack.isEmpty()) {
                        bw.write("-1");
                    } else {
                        bw.write(String.valueOf(stack.pop()));
                    }
                    bw.newLine();
                    break;
                case "3":
                    bw.write(String.valueOf(stack.size()));
                    bw.newLine();
                    break;
                case "4":
                    if (stack.isEmpty()) {
                        bw.write("1");
                    } else {
                        bw.write("0");
                    }
                    bw.newLine();
                    break;
                case "5":
                    if (stack.isEmpty()) {
                        bw.write("-1");
                    } else {
                        bw.write(stack.peek());
                    }
                    bw.newLine();
                    break;
            }
        }
        bw.close();
    }
}
