package baekjoon.gold.level3.test_17386;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] x = new int[4];
        int[] y = new int[4];

        for (int i = 0; i < 4; i+=2) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
            x[i+1] = Integer.parseInt(st.nextToken());
            y[i+1] = Integer.parseInt(st.nextToken());
        }

        if (isIntersect(x, y)) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }

    private static boolean isIntersect(int[] x, int[] y) {
        int ccw1 = ccw(x[0], y[0], x[1], y[1], x[2], y[2]);
        int ccw2 = ccw(x[0], y[0], x[1], y[1], x[3], y[3]);
        int ccw3 = ccw(x[2], y[2], x[3], y[3], x[0], y[0]);
        int ccw4 = ccw(x[2], y[2], x[3], y[3], x[1], y[1]);

        if (ccw1 * ccw2 < 0 && ccw3 * ccw4 < 0) {
            return true;
        }

        if (ccw1 == 0 && onSegment(x[0], y[0], x[1], y[1], x[2], y[2])) {
            return true;
        }
        if (ccw2 == 0 && onSegment(x[0], y[0], x[1], y[1], x[3], y[3])) {
            return true;
        }
        if (ccw3 == 0 && onSegment(x[2], y[2], x[3], y[3], x[0], y[0])) {
            return true;
        }
        if (ccw4 == 0 && onSegment(x[2], y[2], x[3], y[3], x[1], y[1])) {
            return true;
        }

        return false;
    }

    private static int ccw(int x1, int y1, int x2, int y2, int x3, int y3) {
        long result = (long) (x2 - x1) * (y3 - y1) - (long) (y2 - y1) * (x3 - x1);
        if (result > 0) return 1;
        if (result < 0) return -1;
        return 0;
    }

    private static boolean onSegment(int x1, int y1, int x2, int y2, int x3, int y3) {
        return Math.min(x1, x2) <= x3 && x3 <= Math.max(x1, x2) &&
            Math.min(y1, y2) <= y3 && y3 <= Math.max(y1, y2);
    }
}
