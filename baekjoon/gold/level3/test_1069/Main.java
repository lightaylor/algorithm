package baekjoon.gold.level3.test_1069;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        double distance = Math.sqrt(x * x + y * y);

        if (t < d) {
            int jumps = (int) (distance / d);
            double remainingDist = distance - jumps * d;
            double timeUsingJump = jumps * t + remainingDist;
            double timeUsingExtraJump = (jumps + 1) * t;

            if (distance <= d) {
                distance = Math.min(Math.min(distance, t + (d - distance)), 2 * t);
            } else {
                distance = Math.min(timeUsingExtraJump, distance);
            }
            distance = Math.min(timeUsingJump, distance);
        }
        System.out.print(distance);
    }
}

