package gold.level2.test_17387;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] X = new int[4];
        int[] Y = new int[4];

        for (int i = 0; i < 4; i += 2) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            X[i] = Integer.parseInt(st.nextToken());
            Y[i] = Integer.parseInt(st.nextToken());
            X[i + 1] = Integer.parseInt(st.nextToken());
            Y[i + 1] = Integer.parseInt(st.nextToken());
        }

        int ccw1 = ccw(X[0], Y[0], X[1], Y[1], X[2], Y[2]);
        int ccw2 = ccw(X[0], Y[0], X[1], Y[1], X[3], Y[3]);
        int ccw3 = ccw(X[2], Y[2], X[3], Y[3], X[0], Y[0]);
        int ccw4 = ccw(X[2], Y[2], X[3], Y[3], X[1], Y[1]);

        if (ccw1 * ccw2 < 0 && ccw3 * ccw4 < 0) {
            System.out.print(1);
        } else if (ccw1 == 0 && onSegment(X[0], Y[0], X[1], Y[1], X[2], Y[2])) {
            System.out.print(1);
        } else if (ccw2 == 0 && onSegment(X[0], Y[0], X[1], Y[1], X[3], Y[3])) {
            System.out.print(1);
        } else if (ccw3 == 0 && onSegment(X[2], Y[2], X[3], Y[3], X[0], Y[0])) {
            System.out.print(1);
        } else if (ccw4 == 0 && onSegment(X[2], Y[2], X[3], Y[3], X[1], Y[1])) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }

    private static int ccw(int x1, int y1, int x2, int y2, int x3, int y3) {
        double i = (long)(x2 - x1) * (y3 - y1) - (long)(y2 - y1) * (x3 - x1);
        if (i > 0) return 1;
        if (i < 0) return -1;
        return 0;
    }

    private static boolean onSegment(int x1, int y1, int x2, int y2, int x3, int y3) {
        return Math.min(x1, x2) <= x3 && x3 <= Math.max(x1, x2) &&
            Math.min(y1, y2) <= y3 && y3 <= Math.max(y1, y2);
    }
}
