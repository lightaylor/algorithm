package bronze.level1.test_18786;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            points[i] = new Point(sc.nextInt(), sc.nextInt());
        }

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            Point a = points[i];
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                Point b = points[j];

                if (a.y != b.y) continue;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;
                    Point c = points[k];
                    if (a.x != c.x) continue;

                    int base = Math.abs(a.x - b.x);
                    int height = Math.abs(a.y - c.y);
                    int area = base * height;
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        System.out.print(maxArea);
    }

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
