package gold5.test_5430;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            char[] ac = br.readLine().replaceAll("RR", "").toCharArray();
            int m = Integer.parseInt(br.readLine());
            String input = br.readLine();
            Deque<String> deque = new ArrayDeque<>(List.of(input.substring(1, input.length() - 1).isEmpty() ? new String[0] : input.substring(1, input.length() - 1).split(",")));
            boolean direction = true;
            boolean error = false;

            for (char c : ac) {
                if (c == 'R') {
                    direction = !direction;
                } else {
                    if (deque.isEmpty()){
                        error = true;
                        break;
                    } else if (direction) {
                        deque.pollFirst();
                    } else {
                        deque.pollLast();
                    }
                }
            }
            if(error) {
                bw.write("error");
            } else {
                bw.write("[");
                while (!deque.isEmpty()) {
                    if (direction) {
                        bw.write(deque.pollFirst() + (deque.isEmpty() ? "" : ","));
                    } else {
                        bw.write(deque.pollLast() + (deque.isEmpty() ? "" : ","));
                    }
                }
                bw.write("]");
            }
            bw.newLine();
        }

        bw.close();
    }
}
