package silver.level4.test_1358;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int count = 0;
        for (int i = 0; i < P; i ++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if(insideRectangle(X, Y, x, y, X+W, Y+H)
                || insideCircle(X, Y + H/2, x, y, H/2) || insideCircle(X+W, Y + H/2, x, y, H/2)) {
                count++;
            }
        }

        System.out.print(count);
    }

    private static boolean insideRectangle(int startX, int startY, int x, int y, int endX, int endY) {
        return startX <= x && x <= endX && startY <= y && y <= endY;
    }

    private static boolean insideCircle(int X, int Y, int x, int y, int radius) {
        double distance = Math.pow(x - X, 2) + Math.pow(y - Y, 2);
        return distance <= Math.pow(radius, 2);
    }
}
