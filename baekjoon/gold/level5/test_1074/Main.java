package baekjoon.gold.level5.test_1074;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static int x;
    private static int y;
    private static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        x = 0;
        y = 0;
        count = 0;
        int n = (int) Math.pow(2, Integer.parseInt(st.nextToken()));
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(Z(n, r, c)));
        bw.close();
    }

    private static int Z (int n, int r, int c) {
        int size = n / 2;

        // 왼쪽 위
        if (r < x + size && c < y + size) {
            count += 0;
        // 오른쪽 위
        } else if (r < x + size && c >= y + size) {
            count += (size * size);
            y += size;
        // 왼쪽 아래
        } else if (c < y + size) {
            count += (size * size * 2);
            x += size;
        // 오른쪽 아래
        } else {
            count += (size * size * 3);
            x += size;
            y += size;
        }

        if (size == 1) return count;
        return Z(size, r, c);
    }
}
