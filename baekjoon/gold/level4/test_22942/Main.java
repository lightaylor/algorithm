package gold.level4.test_22942;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] circle = new int[n][2];
        for (int i = 0; i < n; i++) {
            circle[i][0] = sc.nextInt();
            circle[i][1] = sc.nextInt();
        }

        Arrays.sort(circle, Comparator.comparingInt(a -> a[0]));
        String answer = "YES";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int x1 = circle[i][0];
                int r1 = circle[i][1];

                int x2 = circle[j][0];
                int r2 = circle[j][1];

                int d = Math.abs(x1 - x2);
                if (d < r1 + r2 && d > Math.abs(r1 - r2)) {
                    answer = "NO";
                    break;
                }

                if (d >= r1 + r2) break;
            }

        }
        System.out.print(answer);
    }
}
