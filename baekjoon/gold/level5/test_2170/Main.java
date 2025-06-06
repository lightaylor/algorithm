package gold.level5.test_2170;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Point> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int x = arr[0];
            int y = arr[1];
            list.add(new Point(x, y));
        }

        list.sort(Comparator.comparingInt(a -> a.x));
        int distance = 0;
        int start = list.get(0).x;
        int end = list.get(0).y;
        for (int i = 1; i < list.size(); i++) {
            Point p = list.get(i);
            if (p.x <= end) {
                end = Math.max(end, p.y);
            } else {
                distance += end - start;
                start = p.x;
                end = p.y;
            }
        }

        distance += end - start;
        System.out.print(distance);
    }
}

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
