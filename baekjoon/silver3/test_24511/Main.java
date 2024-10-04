package silver3.test_24511;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");
        Deque<String> queue = new LinkedList<>();
        int m = Integer.parseInt(br.readLine());
        String[] c = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            if (a[i].equals("0")) {
                queue.add(b[i]);
            }
        }

        for (int i = 0; i < m; i++) {
            queue.addFirst(c[i]);
            bw.write(queue.pollLast() + " ");
        }
        bw.close();
    }
}
