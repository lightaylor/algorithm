package baekjoon.silver.level1.test_15973;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());
        int x4 = Integer.parseInt(st.nextToken());
        int y4 = Integer.parseInt(st.nextToken());

        if (isPoint(x1, y1, x2, y2, x3, y3, x4, y4)) {
            System.out.print("POINT");
        } else if (isLine(x1, y1, x2, y2, x3, y3, x4, y4)) {
            System.out.print("LINE");
        } else if (isFace(x1, y1, x2, y2, x3, y3, x4, y4)) {
            System.out.print("FACE");
        } else {
            System.out.print("NULL");
        }
    }

    private static boolean isPoint(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        return (x2 == x3 && y2 == y3) || (x1 == x4 && y1 == y4) ||
            (x2 == x3 && y1 == y4) || (x1 == x4 && y2 == y3);
    }

    private static boolean isLine(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        return (x1 == x4 || x2 == x3) && (y3 < y2 && y4 > y1) ||
            (y1 == y4 || y2 == y3) && (x3 < x2 && x4 > x1);
    }

    private static boolean isFace(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        return (x1 < x4 && x2 > x3 && y1 < y4 && y2 > y3);
    }
}
