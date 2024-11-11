package gold.level5.test_1107.v1;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static int possible(boolean[] broken, int number) {
        int len = 0;

        if (number == 0) {
            return broken[0] ? -1 : 1;
        }

        while (number > 0) {
            if (broken[number % 10]) {
                return -1;
            } else {
                number /= 10;
                len += 1;
            }
        }
        return len;
    }

    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        int m = Integer.parseInt(br.readLine());
        boolean[] broken = new boolean[10];
        int len = Math.abs(Integer.parseInt(n) - 100);

        if (m > 0) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            while (token.hasMoreTokens()) {
                broken[Integer.parseInt(token.nextToken())] = true;
            }
        }

        for (int i = 0; i < 1_000_000; i++) {
            int possibleCount = possible(broken, i);
            if (possibleCount > -1) {
                int count = Math.abs(Integer.parseInt(n) - i) + possibleCount;
                len = Math.min(count, len);
            }
        }
        bw.write(String.valueOf(len));
        bw.close();
    }
}
