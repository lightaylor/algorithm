package silver2.test_1654;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] lines = new int[a];
        long max = 0;
        long min = 1;
        long answer = 0;

        for (int i = 0; i < a; i++) {
            lines[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, lines[i]);
        }

        while (min <= max) {
            long mid = (min + max) / 2;

            long count = 0;
            for (int line : lines) {
                count += line / mid;
            }

            if (count >= b) {
                answer = mid;
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        System.out.print(answer);
    }
}
