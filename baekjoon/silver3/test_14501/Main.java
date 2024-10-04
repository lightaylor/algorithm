package silver3.test_14501;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    private static int[][] arr;
    private static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n][];
        answer = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        go(0, 0, n);
        bw.write(String.valueOf(answer));
        bw.close();
    }

    private static void go (int day, int sum, int n) {
        if (day == n) {
            answer = Math.max(answer, sum);
            return;
        }

        if (day > n) {
            return;
        }

        go(day + 1, sum, n);
        go(day + arr[day][0], sum + arr[day][1], n);
    }
}
