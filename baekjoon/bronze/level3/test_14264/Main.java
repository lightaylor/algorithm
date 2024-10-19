package bronze.level3.test_14264;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());

        double answer = Math.sqrt(3) / 4 * L * L;

        System.out.print(answer);
    }
}
