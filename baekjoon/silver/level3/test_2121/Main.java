package silver.level3.test_2121;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Point)) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return 10007 * x + y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int w = Integer.parseInt(arr[0]);
        int h = Integer.parseInt(arr[1]);

        Map<Point, Integer> pointCount = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr = br.readLine().split(" ");
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);
            Point p = new Point(x, y);
            pointCount.put(p, pointCount.getOrDefault(p, 0) + 1);
        }

        long total = 0;

        for (Map.Entry<Point, Integer> entry : pointCount.entrySet()) {
            Point p = entry.getKey();
            int baseCount = entry.getValue();

            Point p1 = new Point(p.x + w, p.y);
            Point p2 = new Point(p.x, p.y + h);
            Point p3 = new Point(p.x + w, p.y + h);

            if (pointCount.containsKey(p1) && pointCount.containsKey(p2) && pointCount.containsKey(p3)) {
                long count = (long) baseCount
                    * pointCount.get(p1)
                    * pointCount.get(p2)
                    * pointCount.get(p3);
                total += count;
            }
        }

        System.out.print(total);
    }
}
