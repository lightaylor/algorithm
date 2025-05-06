package silver.level5.test_17286;

import java.util.Scanner;

public class Main {
    static int minDistance;
    static boolean[] visited;
    static Point[] people;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        minDistance = Integer.MAX_VALUE;
        visited = new boolean[3];
        people = new Point[3];

        Point yumi = new Point(sc.nextInt(), sc.nextInt());
        for (int i = 0; i < 3; i++) {
            people[i] = new Point(sc.nextInt(), sc.nextInt());
        }

        permute(0, 0, yumi);
        System.out.print(minDistance);
    }

    static void permute(int depth, double distance, Point current) {
        if (depth == 3) {
            minDistance = (int) Math.min(minDistance, distance);
            return;
        }

        for (int i = 0; i < 3; i++) {
            if (!visited[i]) {
                visited[i] = true;

                Point target = people[i];
                double dist = Math.sqrt(Math.pow(current.x - target.x, 2) + Math.pow(current.y - target.y, 2));
                permute(depth + 1, distance + dist, target);

                visited[i] = false;
            }
        }
    }

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
