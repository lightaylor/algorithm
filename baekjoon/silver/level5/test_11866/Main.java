package silver.level5.test_11866;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder result = new StringBuilder("<");

        for (int i = 1; i <= Integer.parseInt(arr[0]); i++) {
            queue.add(i);
        }


        while (!queue.isEmpty()) {
            for (int i = 1; i < Integer.parseInt(arr[1]); i++) {
                queue.add(queue.poll());
            }
            result.append(queue.poll());
            if (!queue.isEmpty()) {
                result.append(", ");
            }
        }
        result.append(">");
        bw.write(String.valueOf(result));
        bw.close();
    }
}
