package gold.level3.test_12781;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point p1 = new Point(sc.nextInt(), sc.nextInt());
        Point p2 = new Point(sc.nextInt(), sc.nextInt());
        Point p3 = new Point(sc.nextInt(), sc.nextInt());
        Point p4 = new Point(sc.nextInt(), sc.nextInt());

        int ccw1 = ccw(p1, p2, p3);
        int ccw2 = ccw(p1, p2, p4);
        int ccw3 = ccw(p1, p3, p4);
        int ccw4 = ccw(p2, p3, p4);

        if (ccw1 * ccw2 < 0 && ccw3 * ccw4 < 0) {
            System.out.print(1);
        } else if ((ccw1 == 0 && onSegment(p1, p2, p3)) ||
            (ccw2 == 0 && onSegment(p1, p2, p3)) ||
            (ccw3 == 0 && onSegment(p1, p3, p4)) ||
            (ccw4 == 0 && onSegment(p2, p3, p4))) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }

    private static int ccw(Point p1, Point p2, Point p3) {
        double result = (long) (p2.x - p1.x) * (p3.y - p1.y) - (long) (p2.y - p1.y) * (p3.x - p1.x);
        if (result > 0) return 1;
        if (result < 0) return -1;
        return 0;
    }

    private static boolean onSegment(Point p1, Point p2, Point p3) {
        return Math.min(p1.x, p2.x) <= p3.x && p3.x <= Math.max(p1.x, p2.x) &&
            Math.min(p1.y, p2.y) <= p3.y && p3.x <= Math.max(p1.y, p2.y);
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
