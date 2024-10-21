package gold.level4.test_2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double x = Double.parseDouble(st.nextToken());
        double y = Double.parseDouble(st.nextToken());
        double c = Double.parseDouble(st.nextToken());

        System.out.printf("%.3f", findDistance(x, y, c));
    }

    public static double findDistance(double x, double y, double c) {
        double left = 0;
        double right = Math.min(x, y);
        double mid = 0;

        while (right - left > 0.0001) {
            mid = (left + right) / 2;
            double h1 = Math.sqrt(x * x - mid * mid);
            double h2 = Math.sqrt(y * y - mid * mid);
            double currentC = (h1 * h2) / (h1 + h2);

            if (currentC > c) {
                left = mid;
            } else {
                right = mid;
            }
        }

        return mid;
    }
}
