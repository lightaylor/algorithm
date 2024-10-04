package silver4.test_28279;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Deque<String> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");

            switch (arr[0]) {
                case "1":
                    deque.addFirst(arr[1]);
                    break;
                case "2":
                    deque.addLast(arr[1]);
                    break;
                case "3":
                    bw.write(deque.isEmpty() ? "-1" : deque.pollFirst());
                    bw.newLine();;
                    break;
                case "4":
                    bw.write(deque.isEmpty() ? "-1" : deque.pollLast());
                    bw.newLine();
                    break;
                case "5":
                    bw.write(deque.isEmpty() ? "0" : String.valueOf(deque.size()));
                    bw.newLine();
                    break;
                case "6":
                    bw.write(deque.isEmpty() ? "1" : "0");
                    bw.newLine();
                    break;
                case "7":
                    bw.write(deque.isEmpty() ? "-1" : deque.getFirst());
                    bw.newLine();
                    break;
                case "8":
                    bw.write(deque.isEmpty() ? "-1" : deque.getLast());
                    bw.newLine();
                    break;
            }
        }
        bw.close();
    }
}
