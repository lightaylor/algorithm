package silver.level4.test_10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<String > queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            if (input[0].equals("push")) {
                queue.add(input[1]);
            } else if (input[0].equals("pop")) {
                System.out.println(!queue.isEmpty() ? queue.poll() : -1);
            } else if (input[0].equals("size")) {
                System.out.println(queue.size());
            } else if (input[0].equals("empty")) {
                System.out.println(queue.isEmpty() ? 1 : 0);
            } else if (input[0].equals("front")) {
                System.out.println(!queue.isEmpty() ? queue.peek() : -1);
            } else if (input[0].equals("back")) {
                System.out.println(!queue.isEmpty() ? queue.peekLast() : -1);
            }
        }
    }
}
