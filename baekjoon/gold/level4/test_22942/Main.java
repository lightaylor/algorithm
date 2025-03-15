package gold.level4.test_22942;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] circle = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            circle[i][0] = Integer.parseInt(st.nextToken());
            circle[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(circle, Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long x1 = circle[i][0];
                long r1 = circle[i][1];

                long x2 = circle[j][0];
                long r2 = circle[j][1];

                long d = x2 - x1;
                if (d >= r1 + r2) break;
                if (d > Math.abs(r1 - r2)) {
                    System.out.print("NO");
                    return;
                }
            }

        }
        System.out.print("YES");
    }
}
