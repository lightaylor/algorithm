package silver.level4.test_18258;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Queue<String> queue = new LinkedList<>();
        String last = "";

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            switch (input[0]) {
                case "push":
                    queue.add(input[1]);
                    last = input[1];
                    break;
                case "pop":
                    bw.write(queue.isEmpty() ? "-1" : queue.poll());
                    bw.newLine();
                    break;
                case "size":
                    bw.write(String.valueOf(queue.size()));
                    bw.newLine();
                    break;
                case "empty":
                    bw.write(queue.isEmpty() ? "1" : "0");
                    bw.newLine();
                    break;
                case "front":
                    bw.write(queue.isEmpty() ? "-1" : queue.peek());
                    bw.newLine();
                    break;
                case "back":
                    bw.write(queue.isEmpty() ? "-1" : last);
                    bw.newLine();
                    break;
            }
        }
        bw.close();
    }
}
