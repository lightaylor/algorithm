package bronze3.test_4153;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        while (input[0] + input[1] + input[2] > 0) {
            checkRectangle(input[0], input[1], input[2]);
            input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        bw.close();
    }

    static void checkRectangle(int a, int b, int c) throws IOException {
        String answer = "wrong";

        if (a > b && a > c) {
            if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
                answer = "right";
            }
        } else if (b > a && b > c) {
            if (Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)) {
                answer = "right";
            }
        } else {
            if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
                answer = "right";
            }
        }

        bw.write(answer);
        bw.newLine();
    }
}
