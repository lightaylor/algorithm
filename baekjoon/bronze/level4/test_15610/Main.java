package bronze.level4.test_15610;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double N = Double.parseDouble(br.readLine());

        double answer = Math.sqrt(N) * 4;
        System.out.print(answer);
    }
}
