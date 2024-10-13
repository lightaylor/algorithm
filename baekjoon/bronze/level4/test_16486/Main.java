package bronze.level4.test_16486;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int d1 = Integer.parseInt(br.readLine());
        int d2 = Integer.parseInt(br.readLine());

        double answer = (2* d2 * Math.PI) + (d1 * 2);
        System.out.printf("%.6f", answer);
    }
}
