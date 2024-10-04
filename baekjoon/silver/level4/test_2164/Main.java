package silver.level4.test_2164;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        boolean bool = true;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            if (bool) {
                queue.poll();
            } else {
                queue.add(queue.poll());
            }
            bool = bool ? false : true;
        }

        bw.write(String.valueOf(queue.peek()));
        bw.close();
    }
}
